package galaga;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GalagaView extends JFrame implements KeyListener{
	
		private GalagaCanvas can;
		private boolean gAtk;
		private int x1 = 50;
		private int y1 = 50;
		private int x2 = 130;
		private int y2 = 100;
		private int moveX1 = 0;
		private int moveY1 = 1;
		private int moveX2 = 0;
		private int moveY2 = 1;
		private boolean keyUp, keyDown, keyLeft, keyRight;
		private GalagaAttackDTO aDTO;
		//0,0,80,50,0,0,150,75
		
		public GalagaView() {
			
			can= new GalagaCanvas(this);
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(600,200,1000,600);
			
//			can.setBackground(Color.black);
			add(can);

			setVisible(true);
			addKeyListener(this);
			
		}
		
		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			
			if(e.getKeyCode()== KeyEvent.VK_SPACE) {
				gAtk = true;
				aDTO = new GalagaAttackDTO(x2+10,y2-20);
			}

			if(e.getKeyCode()== KeyEvent.VK_LEFT) {
				keyLeft = true;
				if(x1!=-20) {
					x1-=5; 
					x2-=5; 
					moveX1=-6; moveX2=-6;
					moveY1=0; moveY2=0;
				}
			}else if(e.getKeyCode()== KeyEvent.VK_RIGHT) {
				keyRight = true;
				if(x2!=1000) {
					x1+=5; x2+=5; 
					moveX1=6; moveX2=6;
					moveY1=0; moveY2=0;
				}
			}else if(e.getKeyCode()== KeyEvent.VK_UP) {
				keyUp = true;
				if(y1!=0) {
					y1-=5; y2-=5; 
					moveY1=-6; moveY2=-6;
					moveX1=0; moveX2=0;
				}
			}else if(e.getKeyCode()== KeyEvent.VK_DOWN) {
				keyDown = true;
				System.out.println(y2);
				if(y2!=570) {
					y1+=5; y2+=5; 
					moveX1=0; moveX2=0;
					moveY1=6; moveY2=6;
				}
			}
			
			
			
			keyProcess();
			can.repaint();
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			if(e.getKeyCode()== KeyEvent.VK_LEFT) {
				keyLeft = false;
			}else if(e.getKeyCode()== KeyEvent.VK_RIGHT) {
				keyRight = false;
			}else if(e.getKeyCode()== KeyEvent.VK_UP) {
				keyUp = false;
			}else if(e.getKeyCode()== KeyEvent.VK_DOWN) {
				keyDown = false;
			}
			if(e.getKeyCode()== KeyEvent.VK_SPACE) {
			//	gAtk = false;
			}
		}
		
		public void keyProcess() {
			if(keyUp && keyLeft) {
				if(x1>0 && y1>0) {
					x1-=5; x2-=5;
					y1-=5; y2-=5;
					moveX1=-6; moveX2=-6;
					moveY1=-6; moveY2=-6;
				}
			}else if(keyUp && keyRight) {
				if(x2<1000 && y1>0) {
					System.out.println(x1);
					System.out.println(y1);
					x1+=5; x2+=5;
					y1-=5; y2-=5;
					moveX1=6; moveX2=6;
					moveY1=-6; moveY2=-6;
				}
			}else if(keyDown && keyLeft) {
				if(x1>0 && y2<560) {
					x1-=5; x2-=5;
					y1+=5; y2+=5;
					moveX1=-6; moveX2=-6;
					moveY1=6; moveY2=6;
				}
			}else if(keyDown && keyRight) {
				if(x2<1000 && y2<560) {
					x1+=5; x2+=5;
					y1+=5; y2+=5;
					moveX1=6; moveX2=6;
					moveY1=6; moveY2=6;
				}
			}
			
			
		}

		public int getX2() {
			return x2;
		}

		public void setX2(int x2) {
			this.x2 = x2;
		}

		public int getX1() {
			return x1;
		}

		public void setX1(int x1) {
			this.x1 = x1;
		}

		public int getY1() {
			return y1;
		}

		public void setY1(int y1) {
			this.y1 = y1;
		}

		public int getY2() {
			return y2;
		}

		public void setY2(int y2) {
			this.y2 = y2;
		}
		
		public int getMoveY1() {
			return moveY1;
		}

		public int getMoveX2() {
			return moveX2;
		}

		public int getMoveY2() {
			return moveY2;
		}

		public int getMoveX1() {
			return moveX1;
		}

		public boolean isgAtk() {
			return gAtk;
		}

		public void setgAtk(boolean gAtk) {
			this.gAtk = gAtk;
		}

		public static void main(String[] args) {
			new GalagaView();
		}

		public GalagaAttackDTO getaDTO() {
			return aDTO;
		}

		public void setaDTO(GalagaAttackDTO aDTO) {
			this.aDTO = aDTO;
		}
		
}
