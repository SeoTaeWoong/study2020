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
		System.out.println("x�� �Է� : ");
		x = sc.nextInt();
		System.out.println("y�� �Է� : ");
		y = sc.nextInt();
	}
	public void output() {	
		assert y>=0 : "y��0���� ũ�ų� ���ƾ� �Ѵ�";
		
		for(int i=0; i<y; i++) {
			result *=x;
		}System.out.println(x + "�� " + y + "����" + result);
		
	}
}
