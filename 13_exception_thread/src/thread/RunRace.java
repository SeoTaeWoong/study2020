package thread;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;

public class RunRace extends Frame implements ActionListener{
	private int count;
	private String[] name;
	private Button btn;
	private Racer[] r;
	
	
	public RunRace(int count, String[] name) {
		this.count = count;
		this.name = name;
		
		btn = new Button("출발");
	    
	    Panel p = new Panel(new FlowLayout(FlowLayout.RIGHT));
	    p.add(btn);
	    add("South",p);
	    
	    Panel p2 = new Panel(new GridLayout(count,1));
	    r = new Racer[count];
	    
	    for(int i =0; i<count; i++) {
	    	r[i] = new Racer();//Canvas 생성
	    	//setName(name[i]);
	    	p2.add(r[i]);
	    }

	    add("Center", p2);
	    

		setTitle("경주게임");
	    setBounds(800,300,600,500);
	    setResizable(false);//창고정
	    setVisible(true);

	    this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	    btn.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		btn.setEnabled(false);
		
		Thread[] t = new Thread[count];
		for(int i=0; i<count; i++) {
			t[i] = new Thread(r[i], name[i]);
			t[i].setPriority((int)(Math.random()*10+1));
			t[i].start();
		}
		
	}
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("경주마 수를 입력 : ");
		int count = sc.nextInt();
		
		String[] name = new String[count];
		for(int i=0; i<count; i++) {
			System.out.println("경주마 이름을 입력 : ");
			name[i] = sc.next();
		}
		new RunRace(count,name); 
	}

}