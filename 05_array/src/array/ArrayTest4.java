package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayTest4 {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public void input(boolean[] ar) throws IOException {
		System.out.print("��ġ �Է� : ");
		int index= Integer.parseInt(br.readLine());
		if(ar[index-1]) {
			System.out.println(index+"��ġ�� ���� /�̹� �����Ǿ��ֽ��ϴ�.");			
		}else {
			System.out.println(index+"��ġ�� ����.");	
			ar[index-1] = true;
		}
		System.out.println();
	}

	public void output(boolean[] ar) throws IOException {
		System.out.print("��ġ �Է� : ");
		int number= Integer.parseInt(br.readLine());
		
		if(ar[number-1]) {
			System.out.println(number+"��ġ�� ����.");	
			ar[number-1] = false;
		}else {
			System.out.println(number+"��ġ�� ���� /�����Ǿ� ���� �ʽ��ϴ�.");
			System.out.println();
		}
	}

	public void list(boolean[] ar) {
		System.out.println();
		for(int data =0; data<ar.length; data++) {
			System.out.println((data+1)+"��ġ : "+ar[data]);
		}
	}

	public void menu(boolean[] ar) throws IOException {
		int number = 0;
		boolean a = true;
		while (a) {
			System.out.println("**************");
			System.out.println("   1.����");
			System.out.println("   2.����");
			System.out.println("   3.����Ʈ");
			System.out.println("   4.����");
			System.out.println("**************");
			System.out.print("�޴�: ");
			number = Integer.parseInt(br.readLine());
			switch (number) {
			case 1:
				input(ar);
				break;
			case 2:
				output(ar);
				break;
			case 3:
				list(ar);
				break;
			case 4:
				a = false;
				break ;
			default :
				System.out.println("1~4�� �Է� ����");
				break;
			}

		}
	}
  //a=1  a=a+a++  // a = 2=1+1;(a= a+a=a+1)
	//a=1 a=a++ +a // a= a=a+1+a
		
	public static void main(String[] args) throws IOException {
		boolean[] ar = new boolean[5];
		ArrayTest4 at4 = new ArrayTest4();
		at4.menu(ar);
		System.out.println("���α׷��� �����մϴ�.");

	}
}
