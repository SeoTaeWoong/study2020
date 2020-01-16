package thread;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Racer extends Canvas implements Runnable{
	private Image img;
	private int pos;
	private static int rank=1;
	
	public Racer() {
		Toolkit p = Toolkit.getDefaultToolkit();
		img = p.getImage("horse.gif");
		//setBackground(new Color((int)(Math.random()*256), (int)(Math.random()*256), 255));
	}
	
//	public Racer(String name) {
//		// TODO Auto-generated constructor stub
//	}

	@Override
	public void paint(Graphics g) {
		g.drawLine(0,this.getHeight()/2,600,this.getHeight()/2);
		g.drawImage(img, pos,0,25,this.getHeight(),this);
	}

	@Override
	public void run() {
		for(int i=0; i<600; i+=(int)(Math.random()*10+1)) {
			pos =i;
			repaint();
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}

		System.out.println(rank+"µî"+"\t"+Thread.currentThread().getName());
		rank++;
	}
}
