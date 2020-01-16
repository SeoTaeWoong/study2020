package nested;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Card {
	private Frame frame;
	private CardLayout card; // 많이 이용함
	
	public Card() {
		frame = new Frame();
		card = new CardLayout();
		frame.setLayout(card);
		
		String[] title = {"빨강","초록","파랑","노랑","보라","하늘"};
		Color[] color = {Color.RED,Color.GREEN,Color.BLUE,Color.YELLOW,Color.MAGENTA,Color.CYAN};
		Panel[] p = new Panel[6];
		for(int i=0; i<p.length; i++) {
			p[i] = new Panel();
			p[i].setBackground(color[i]);
			
			frame.add(p[i], title[i]);
			
			//이벤트
			p[i].addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					card.next(frame);
					//card.show(frame, "보라"); //선택지정
				}
			});
		
			}

		frame.setBounds(800,300,300,400);
		frame.setVisible(true);
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		new Card();
	}

}
