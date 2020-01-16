package abstract_01;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class WindowTest extends Frame{
	public WindowTest() {
	super("¿ÃπÃ¡ˆ");
	setBounds(800,300,300,400);
	setVisible(true);
		
	}
	@Override
	public void paint(Graphics g) {
		Toolkit t = Toolkit.getDefaultToolkit();
		Image img = t.getImage("ryan.png");
		g.drawImage(img, 50, 50, this);
	}

	public static void main(String[] args) {
		new WindowTest();

	}

}
