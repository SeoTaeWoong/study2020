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
		setTitle("���� ���� ������");
		
		//Color color = new Color(70,68,69);
		//setBackground(Color.CYAN);
		
		//setBackground(color);
		//setSize(300,400);
		setBounds(800, 300, 300, 400);
		setVisible(true);
		
		//�̺�Ʈ
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		this.addWindowListener(new WindowExit());
		
	}
	@Override
	public void paint(Graphics g) {//Call Back �ݹ�ޤļҵ�(���� �����̵Ǹ� JVM�� ���ؼ� ȣ���)
		g.drawString(lo, Px, Py);
	}
	public static void main(String[] args) {
		new WindowTest();
	}
	//MouseListener Override - Event Handler
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("���콺 Ŭ��");
		
		lo = "X:"+e.getX()+"\t y:"+e.getY();
		Px = e.getX();
		Py = e.getY();
		repaint();//update()-paint() ������ ȣ��
	}

	
	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("���콺 IN");
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("���콺 OUT");
		
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
		System.out.println("���콺 �巡��");
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	//MouseMotionistener Override - Event Handler
}
