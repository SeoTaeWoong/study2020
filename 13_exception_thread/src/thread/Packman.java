package thread;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Packman extends Frame implements KeyListener, Runnable{
	private Image img, img2;
	private int sel=2;
	private int x=225, y=225;
	private int mx,my;
	private int[] px, py;
	
	
	public Packman() {
		Toolkit p = Toolkit.getDefaultToolkit();//Toolkit.getDefaultToolkit.getImage("이미지이름")
		img = p.getImage("packman.jpg");
		Toolkit d = Toolkit.getDefaultToolkit();
		img2 = d.getImage("food.jpg");
		
		px = new int[5];
		py = new int[5];
		for(int i =0; i<px.length; i++) {
			px[i] = (int)(Math.random()*461+20);//20~480
			py[i] = (int)(Math.random()*461+20);
		}
		setTitle("팩맨");
	    setBounds(800,300,500,500);
	    setResizable(false);//창고정
	    setVisible(true);
	    
	    this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	    //스레드생성
	    Thread t = new Thread(this);
	    t.start();
	    
	    addKeyListener(this);
		
	}
	@Override
	public void paint(Graphics g) {
		g.drawImage(img, 
				x, y, x+50, y+50,//화면위치 
				sel*50, 0, sel*50+50, 50, //이미지 위치
				this);
		for(int i=0; i<px.length; i++) {
			g.drawImage(img2, px[i], py[i],this);
		}
		
		
		
	}
	public static void main(String[] args) {
		Packman pm = new Packman();
	}
	@Override
	public void run() {
		while(true) {
			if(sel%2==0)sel++;
			else sel--;
			x-=mx;
			y+=my;
			
			if(x>500) {
				x=0;
			} else if(x<0) {
				x=500;
			} else if(y>500) {
				y=0;
			} else if(y<0) {
				y=500;
			}

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			for(int i=0; i<px.length; i++) {
				if(x+25==px[i]-10 && y+25==py[i]-10
				&& x+25<+px[i]+20+10 &&y+25<py[i]+20+10)
					px[i]=py[i]=-100;
			
//			for(int i=0; i<px.length; i++) {
//				if(x+40>px[i] && 
//				   x+10<px[i]+20 && 
//				   y+10<py[i]+20 && 
//				   y+40>py[i]) {
//					System.out.println("음식px="+px[i]+"음식py="+py[i]);
//					System.out.println(x+"\t"+y);
//					
//					px[i] = -100;
//					py[i] = -100;
//					
//				}
			}repaint();
		}
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_ESCAPE) System.exit(0);
		else if(e.getKeyCode()==KeyEvent.VK_LEFT) {
			sel=0;
			mx=10; my=0;
		}else if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
			sel=2; 
			mx=-10; my=0;		
		}else if(e.getKeyCode()==KeyEvent.VK_UP) {
			sel=4; 
			mx=0; my=-10;
		}else if(e.getKeyCode()==KeyEvent.VK_DOWN) {
			sel=6;
			mx=0; my=10;
		}

	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
