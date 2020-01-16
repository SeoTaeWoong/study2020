package thread;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Clock extends Frame implements Runnable {
	
	public Clock() {
		setForeground(Color.red);
		this.setFont(new Font("돋움체", Font.BOLD,30));

		setTitle(" ");
	    setBounds(800,300,500,400);
	    setVisible(true);
	    this.addWindowListener(new WindowAdapter() {
	    	public void windowClosing(WindowEvent e) {
	    		System.exit(0);
	    	}
		});
	    //스레드 생성
	    Thread t = new Thread(this);
	    //스레드 시작
	    t.start();
	}
	public void paint(Graphics g) {
		SimpleDateFormat sdf = new SimpleDateFormat("HH시 mm분 ss초");
		
			Date d = new Date();
			g.drawString(sdf.format(d),100, 100);
	
	}
	
	public static void main(String[] args) {
		Clock c = new Clock();
	}
		
	@Override
	public void run(){
		while(true) {
			repaint();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
