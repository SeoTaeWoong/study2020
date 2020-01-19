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
	
	private int x1=500;
	private int y1=500;
	private int x2=6100;
	private int y2=1900;
	
	private int atk1;
	private int atk2;
	private int cnt;
	private int cnt1;
	Image imageB = getToolkit().getDefaultToolkit().getImage("image/space1.jpg");;
	Image imageF = getToolkit().getDefaultToolkit().getImage("image/ufo정면.png");;
	Image imageA = getToolkit().getDefaultToolkit().getImage("image/15.gif");;
	Image imageM1 = getToolkit().getDefaultToolkit().getImage("image/mop1.png");;
	private Image img;
	private Graphics gg;
	private List<GalagaAttackDTO> list;
	private GalagaView gv;
	private GalagaMop gm;
	private Thread t;
	
	
	public GalagaCanvas(GalagaView gv) {
		list = new ArrayList<GalagaAttackDTO>();
		this.gv = gv;
		this.gm = new GalagaMop();
		
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
//			if(gv.getSkillCnt()>=5) {
//				imageA = getToolkit().getDefaultToolkit().getImage("image/SKILL.png");
//				gg.drawImage(imageA, gv.getX2()+20 ,gv.getY1(), this);
//				gv.setSkillCnt(1);
//			}else {
//			}
			list.add(gv.getaDTO());
			gv.setgAtk(false);
			
		} 
		for(GalagaAttackDTO dto : list) {
			gg.drawImage(imageA, dto.x, dto.y, dto.x+30, dto.y+10, 0, 0, 20, 10, this);
		}
		gg.drawImage(imageM1, gm.getmMoveX1(), gm.getmMoveY1(),80,40, this);
		gg.drawImage(imageM1, gm.getmMoveX1(), gm.getmMoveY1(),80,40, this);
		gg.drawImage(imageM1, gm.getmMoveX1(), gm.getmMoveY1(),80,40, this);
		gg.drawImage(imageM1, gm.getmMoveX1(), gm.getmMoveY1(),80,40, this);
		
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
				Thread.sleep(30);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			repaint();
			
			//공격
			for(int i =0; i<list.size(); i++) {
				if(list.get(i).x+30>gm.getmMoveX1()&&(list.get(i).y>gm.getmMoveY1()&&list.get(i).y<gm.getmMoveY1()+40)) { 
					//피격시
					
					list.remove(i);
					i--;
				}else if(list.get(i).x<1000){
					list.get(i).x+=+4;
				}else{
					list.remove(i);
					i--;
				}
			}

			//비행기 자동이동
			gv.setX1(gv.getX1()+gv.getMoveX1());
			gv.setY1(gv.getY1()+gv.getMoveY1());
			gv.setX2(gv.getX2()+gv.getMoveX2());
			gv.setY2(gv.getY2()+gv.getMoveY2());
			//비행기 자동이동
			
			
			// **-- 몬스터 --**
			gm.setmMoveX1(gm.getmMoveX1()-gm.getSpeed());
			gm.setSel(gm.getSel()+1);
			if(gm.getSel()==0) {
				imageM1 = getToolkit().getDefaultToolkit().getImage("image/mop1.png");;
			}else if(gm.getSel()==10) {
				imageM1 = getToolkit().getDefaultToolkit().getImage("image/mop2.png");;
			}else if(gm.getSel()==12) {
				imageM1 = getToolkit().getDefaultToolkit().getImage("image/mop3.png");;
			}else if(gm.getSel()==16) {
				imageM1 = getToolkit().getDefaultToolkit().getImage("image/mop4.png");
			}else if(gm.getSel()==20) {
				gm.setSel(0);
			}
			
			
			
		}
			
	}
		
	
}
