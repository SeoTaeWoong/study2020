package interface_1;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ImageMove extends Frame implements WindowListener, ActionListener{
	/**
	 * <font style="color:red;">����, ������, ��, �Ʒ��� �̵���Ű�� ��ư�̴�.</font>
	 */
	public Button reset, left, right, up, down;
	String img;
	/**
	 * �̹����� ���� ��ġ
	 */
	int x = 140;
	int y = 130;
	
	/**
	 * <font style="color:red;">����ȭ���� �ٸ��ִ� �޼ҵ�</font>
	 */
	public void init() {
		setTitle("�̹��� �̵�");
		
		setBounds(800, 300, 500, 500);
		setVisible(true);
		reset = new Button("�ʱ�ȭ");
		left = new Button("����");
		up = new Button("��");
		down = new Button("�Ʒ�");
		right = new Button("������");
		
		//area = new TextArea();
		
		Panel p = new Panel();//FlowLaydout(������ġ - �߾�)
		p.setBackground(new Color(250,220,220));
		p.setLayout(new GridLayout(1,5,3,0));
		p.add(reset);
		p.add(left);
		p.add(up);
		p.add(down);
		p.add(right);
		
		this.add("North", p);
		//this.add("Center");
		

		//�̺�Ʈ
		this.addWindowListener(this);
		left.addActionListener(this);
		up.addActionListener(this);
		down.addActionListener(this);
		right.addActionListener(this);
		reset.addActionListener(this);
		


		
	}
	public void paint(Graphics g) {
		Toolkit t = Toolkit.getDefaultToolkit();
		Image img = t.getImage("groot.png");
		g.drawImage(img, x, y, this);
	}


	public static void main(String[] args) {
	 new ImageMove().init();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==reset) {
			x = 140;
			y = 130;
		}
			repaint();
		if(e.getSource() == left){
			x -= 10;
			if(x==-180) {
			   x=500;
			}
			   repaint();
		} if(e.getSource() == up){
			   y -= 10;
			 if(y==-180) {
				y=500;
			 }
			   repaint();
		} if(e.getSource() == down){
			   y += 10;
			   if(y==+580) {
				   y=-250;
				}
			   repaint();
		} if(e.getSource() == right){
			   x += 10;
			   if(x==580) {
				   x=-180;
				}
			   repaint();
			  }
		
	}
	
	@Override
	public void windowActivated(WindowEvent e) {}
	@Override
	public void windowClosed(WindowEvent e) {}
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("���α׷��� �����մϴ�");
		System.exit(0);//���α׷� ��������
		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {}
	@Override
	public void windowDeiconified(WindowEvent e) {}
	@Override
	public void windowIconified(WindowEvent e) {}
	@Override
	public void windowOpened(WindowEvent e) {}


}
