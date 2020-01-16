package abstract_01;

import java.util.Scanner;

public class Assert {
	Scanner sc = new Scanner(System.in);
	private int x, y;
	int result=1;
	
	public static void main(String[] args) {
		Assert asert = new Assert();
		
		asert.input();
		asert.output();
	}
	
	public void input() {
		System.out.println("x값 입력 : ");
		x = sc.nextInt();
		System.out.println("y값 입력 : ");
		y = sc.nextInt();
	}
	public void output() {	
		assert y>=0 : "y는0보다 크거나 갈아야 한다";
		
		for(int i=0; i<y; i++) {
			result *=x;
		}System.out.println(x + "의 " + y + "승은" + result);
		
	}
}
