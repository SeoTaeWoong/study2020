package inheritance;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class WindowTest extends Frame {   // WindowTest is a Frame

	public WindowTest() {
		
		super("너가만든윈도우");
		//setBackground(Color.GRAY);
		setForeground(Color.YELLOW);
		setBackground(new Color(40,49,200));
		//this.setSize(300,400);
		setBounds(700,300,300,400);
		setVisible(true);
		
		
		
		
	}
	@Override
	public void paint(Graphics g) { //Call Back Method (일정 시점이 되면 JVM에 의해서 호출) paint의 경우는 프레임이 실행될때 자동으로
		g.drawLine(100, 100,250,250);
		g.drawLine(250, 100,100,250);
		g.drawRect(100, 100, 150, 150);
		g.drawOval(100, 100, 150, 150);
		repaint();
	}
	public static void main(String[] args) {
		new WindowTest();
		new WindowTest();
		
		
		/*
		 * Frame f1 = new Frame("내가만든 윈도우");
		f1.setBounds(700,300,300,400);
		f1.setForeground(Color.GREEN);
		f1.setBackground(new Color(40,49,200));
		f1.setVisible(true);
		 */
	}

	
}
