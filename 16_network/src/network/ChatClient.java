package network;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class ChatClient extends JFrame{
	
	JTextArea output;
	JTextField input;
	JButton send;
	
	public ChatClient(){
		//����� ���� ��ũ�ѹٰ� �׻� �߰�
		//���� �Է��� �ȵǰ�
		
		output = new JTextArea();
		output.setEditable(false);
		input = new JTextField();
		send = new JButton("����");
		
		
		JPanel southP = new JPanel(new BorderLayout());
		southP.add("Center",input); southP.add("East",send);
		
		
		JScrollPane scroll = new JScrollPane();
		scroll.setViewportView(output);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		// ��ũ�ѹٰ� �׻� ���ְ�  ^
		
		Container con = getContentPane();
		con.add("Center",scroll);
		con.add("South",southP);
		
		setTitle("ä��");
		setBounds(800,300,400,250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void service() {
		String serverIP = JOptionPane.showInputDialog(this,"����IP�� �Է��ϼ���.", "127.0.0.1");
		if(serverIP==null || serverIP.length()==0) {
			System.out.println("����IP�� �Էµ��� �ʾҽ��ϴ�.");
			System.exit(0);
		}
		
		String nickName = JOptionPane.showInputDialog(this,"�г����� �Է��ϼ���.","",JOptionPane.INFORMATION_MESSAGE);
		if(nickName ==null || nickName.length() == 0) {
			nickName="guest";
		}
		
	}	
	
	
	public static void main(String[] args) {
		new ChatClient().service();
	}
}