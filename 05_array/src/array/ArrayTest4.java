package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayTest4 {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public void input(boolean[] ar) throws IOException {
		System.out.print("위치 입력 : ");
		int index= Integer.parseInt(br.readLine());
		if(ar[index-1]) {
			System.out.println(index+"위치에 입차 /이미 주차되어있습니다.");			
		}else {
			System.out.println(index+"위치에 입차.");	
			ar[index-1] = true;
		}
		System.out.println();
	}

	public void output(boolean[] ar) throws IOException {
		System.out.print("위치 입력 : ");
		int number= Integer.parseInt(br.readLine());
		
		if(ar[number-1]) {
			System.out.println(number+"위치에 출차.");	
			ar[number-1] = false;
		}else {
			System.out.println(number+"위치에 출차 /주차되어 있지 않습니다.");
			System.out.println();
		}
	}

	public void list(boolean[] ar) {
		System.out.println();
		for(int data =0; data<ar.length; data++) {
			System.out.println((data+1)+"위치 : "+ar[data]);
		}
	}

	public void menu(boolean[] ar) throws IOException {
		int number = 0;
		boolean a = true;
		while (a) {
			System.out.println("**************");
			System.out.println("   1.입차");
			System.out.println("   2.출차");
			System.out.println("   3.리스트");
			System.out.println("   4.종료");
			System.out.println("**************");
			System.out.print("메뉴: ");
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
				System.out.println("1~4번 입력 가능");
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
		System.out.println("프로그램을 종료합니다.");

	}
}
