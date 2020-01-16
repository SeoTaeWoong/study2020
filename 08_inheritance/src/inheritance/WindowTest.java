package inheritance;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class WindowTest extends Frame {   // WindowTest is a Frame

	public WindowTest() {
		
		super("�ʰ�����������");
		//setBackground(Color.GRAY);
		setForeground(Color.YELLOW);
		setBackground(new Color(40,49,200));
		//this.setSize(300,400);
		setBounds(700,300,300,400);
		setVisible(true);
		
		
		
		
	}
	@Override
	public void paint(Graphics g) { //Call Back Method (���� ������ �Ǹ� JVM�� ���ؼ� ȣ��) paint�� ���� �������� ����ɶ� �ڵ�����
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
		 * Frame f1 = new Frame("�������� ������");
		f1.setBounds(700,300,300,400);
		f1.setForeground(Color.GREEN);
		f1.setBackground(new Color(40,49,200));
		f1.setVisible(true);
		 */
	}

	
}
