package interface_1;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class WindowTest extends JFrame implements MouseListener, MouseMotionListener{
	int Px, Py;
	String lo="";
	public WindowTest() {
		setTitle("내가 만든 윈도우");
		
		//Color color = new Color(70,68,69);
		//setBackground(Color.CYAN);
		
		//setBackground(color);
		//setSize(300,400);
		setBounds(800, 300, 300, 400);
		setVisible(true);
		
		//이벤트
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		this.addWindowListener(new WindowExit());
		
	}
	@Override
	public void paint(Graphics g) {//Call Back 콜백메ㅔ소드(일정 시점이되면 JVM에 의해서 호출됨)
		g.drawString(lo, Px, Py);
	}
	public static void main(String[] args) {
		new WindowTest();
	}
	//MouseListener Override - Event Handler
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("마우스 클릭");
		
		lo = "X:"+e.getX()+"\t y:"+e.getY();
		Px = e.getX();
		Py = e.getY();
		repaint();//update()-paint() 순으로 호출
	}

	
	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("마우스 IN");
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("마우스 OUT");
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	//MouseListener Override - Event Handler
	//MouseMotionistener Override - Event Handler
	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("마우스 드래그");
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	//MouseMotionistener Override - Event Handler
}
