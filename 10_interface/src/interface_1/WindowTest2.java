package interface_1;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//Framed은 BorderLayout(동 서 남 북)
public class WindowTest2 extends Frame implements WindowListener, ActionListener{
	private Button exitB, newB;
	private TextArea area;
	
	public void init() {
		newB = new Button("새로만들기");
		exitB = new Button("끝내기");
		area = new TextArea();
		
		Panel p = new Panel();//FlowLaydout(순서배치 - 중앙)
		p.setBackground(new Color(250,220,220));
		p.add(newB);
		p.add(exitB);
		this.add("North", p);
		this.add("Center", area);
		
		setBounds(800, 300, 300, 400);
		setVisible(true);
		
		//이벤트
		this.addWindowListener(this);
		newB.addActionListener(this);
		exitB.addActionListener(this);
		
	}
	
	public static void main(String[] args) {
		new WindowTest2().init();
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
		
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==newB) {
			area.setText(" ");//공백
			area.setText("");//초기화
		}
		else if(e.getSource()==exitB)System.exit(0);//참조값
		
	}

}
