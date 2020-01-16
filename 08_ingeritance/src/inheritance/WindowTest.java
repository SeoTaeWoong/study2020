package inheritance;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class WindowTest extends Frame{
	public WindowTest() {
		super("내가만든윈도우");//부모생성자 호출
		Color color = new Color(70,68,69);
		//setBackground(Color.CYAN);
		setForeground(Color.red);
		//setBackground(color);
		//setSize(300,400);
		setBounds(800, 300, 300, 400);
		setVisible(true);
	
		
	}

	@Override
	public void paint(Graphics g) {//Call Back 콜백메ㅔ소드(일정 시점이되면 JVM에 의해서 호출됨)
		g.drawLine(50,100,150,200);
		g.drawLine(150,100,50,200);
		g.drawRect(100,100,150,150);
		g.drawOval(200, 200, 50, 50);
	}

	public static void main(String[] args) {
		new WindowTest();
		
		
		
	}

}
