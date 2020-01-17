package network;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class ChatClientObject extends JFrame implements ActionListener, Runnable{
	
	JTextArea output;
	JTextField input;
	JButton send;
	private ObjectOutputStream oos;
	private ObjectInputStream ois;
	private Socket socket;
	private InfoDTO dto;
	
	public ChatClientObject(){
		//실행시 세로 스크롤바가 항상 뜨게
		//에어리어에 입력이 안되게
		
		output = new JTextArea();
		output.setEditable(false);
		input = new JTextField();
		send = new JButton("전송");
		
		dto = new InfoDTO();
		
		
		JPanel southP = new JPanel(new BorderLayout());
		southP.add("Center",input); southP.add("East",send);
		
		
		JScrollPane scroll = new JScrollPane();
		scroll.setViewportView(output);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		// 스크롤바가 항상 떠있게  ^
		
		Container con = getContentPane();
		con.add("Center",scroll);
		con.add("South",southP);
		
		setTitle("채팅");
		setBounds(800,300,400,250);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				try {
					oos.writeObject(dto);
					oos.flush();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

	}
	
	public void service() {
		String serverIP = JOptionPane.showInputDialog(this,"서버IP를 입력하세요.", "127.0.0.1");
		if(serverIP==null || serverIP.length()==0) {
			System.out.println("서버IP가 입력되지 않았습니다.");
			System.exit(0);
		}
		
		dto.setNickName(JOptionPane.showInputDialog(this,"닉네임을 입력하세요.","",JOptionPane.INFORMATION_MESSAGE));
		if(dto.getNickName() ==null || dto.getNickName().length() == 0) {
			dto.setNickName("guest");
		}
		dto.setCommand(Info.JOIN);
		
		try {
			socket = new Socket(serverIP,9500);
			oos = new ObjectOutputStream(socket.getOutputStream());
			ois = new ObjectInputStream(socket.getInputStream());
			oos.writeObject(dto);
			oos.flush();
			
			System.out.println("클라도 준비 완료");
		} catch (UnknownHostException e) {
			System.out.println("호스트를 찾을 수 없습니다.");
			System.exit(0);
		} catch (IOException e) {
			System.out.println("호스트와의 연결이 끊겼습니다.");
			System.exit(0);
		}
		System.out.println("버튼");
		
		Thread t = new Thread(this);
		t.start();
		
		send.addActionListener(this);
		input.addActionListener(this);
		
	}	
	
	@Override
	public void run() {
		//서버로 받는쪽
		String line;
		while(true) {
			try {
				dto = (InfoDTO)ois.readObject();
				if(dto==null||dto.getMsg().toLowerCase().trim().equals("quit")) {
					ois.close();
					oos.close();
					socket.close();
					System.exit(0);
				}
				
				output.append(dto.getMsg()+"\n");
				int pos = output.getText().length();
				output.setCaretPosition(pos);
				
			} catch (IOException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//서버한테 보내는쪽
		
		dto.setMsg(input.getText());
		try {
			oos.writeObject(dto);
			oos.flush();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		input.setText("");
	}
	
	public static void main(String[] args) {
		new ChatClientObject().service();
	}

}
