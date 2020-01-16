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
	 * <font style="color:red;">왼쪽, 오른쪽, 위, 아래로 이동시키는 버튼이다.</font>
	 */
	public Button reset, left, right, up, down;
	String img;
	/**
	 * 이미지의 시작 위치
	 */
	int x = 140;
	int y = 130;
	
	/**
	 * <font style="color:red;">메인화면을 꾸며주는 메소드</font>
	 */
	public void init() {
		setTitle("이미지 이동");
		
		setBounds(800, 300, 500, 500);
		setVisible(true);
		reset = new Button("초기화");
		left = new Button("왼쪽");
		up = new Button("위");
		down = new Button("아래");
		right = new Button("오른쪽");
		
		//area = new TextArea();
		
		Panel p = new Panel();//FlowLaydout(순서배치 - 중앙)
		p.setBackground(new Color(250,220,220));
		p.setLayout(new GridLayout(1,5,3,0));
		p.add(reset);
		p.add(left);
		p.add(up);
		p.add(down);
		p.add(right);
		
		this.add("North", p);
		//this.add("Center");
		

		//이벤트
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
		System.out.println("프로그램을 종료합니다");
		System.exit(0);//프로그램 강제종료
		
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
