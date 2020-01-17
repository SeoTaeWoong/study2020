package galaga;

import java.awt.Canvas;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ImageProducer;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;


public class GalagaCanvas extends Canvas implements Runnable{
	
	int x1=500;
	int y1=500;
	int x2=6100;
	int y2=1900;
	
	int atk1;
	int atk2;
	int cnt;
	int cnt1;
	Image imageB = getToolkit().getDefaultToolkit().getImage("image/space1.jpg");;
	Image imageF = getToolkit().getDefaultToolkit().getImage("image/F-14.gif");;
	Image imageA = getToolkit().getDefaultToolkit().getImage("image/15.gif");;
	Image img;
	Graphics gg;
	private List<GalagaAttackDTO> list;
	GalagaView gv;
	Thread t;
	
	public GalagaCanvas(GalagaView gv) {
		list = new ArrayList<GalagaAttackDTO>();
		this.gv = gv;
		
	}
	
	@Override
	public void update(Graphics g) {
		paint(g);
	}
	public void paint(Graphics g) {
		img=createImage(1000,600);
		gg = img.getGraphics();
		buffering(gg);
		if(cnt==0) {
			repaint();
			cnt++;
			System.out.println(cnt);
		}
		g.drawImage(img, 0, 0, null);
	}
	private void buffering(Graphics gg) {
		t = new Thread(this);
		if(cnt1==0) {
			t.start();
			cnt1=1;
		}
		
		
		gg.drawImage(imageB, 0, 0, 5600, 1400,x1,y1,x2,y2,this);
		gg.drawImage(imageF, gv.getX1(),gv.getY1(),gv.getX2(),gv.getY2(),0,0,150,75,this);
		if(gv.isgAtk()) {
			list.add(gv.getaDTO());
		}
		for(GalagaAttackDTO dto : list) {
			gg.drawImage(imageA, dto.x, dto.y, dto.x+30, dto.y+10, 0, 0, 20, 10, this);
		}
	}
	
	@Override
	public void run() {
		while(true) {
			
			try {
				x1+=1;
				x2+=1;
				if(x1 > 4700) {
					x1=0; x2=5400;
				}
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			repaint();
			for(GalagaAttackDTO dto : list) {
				dto.x+=+3;
			}

			
			gv.setX1(gv.getX1()+gv.getMoveX1());
			gv.setY1(gv.getY1()+gv.getMoveY1());
			gv.setX2(gv.getX2()+gv.getMoveX2());
			gv.setY2(gv.getY2()+gv.getMoveY2());
			
		}
			
	}
		
	
}
