package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice8 {
	public static void main(String[] args) throws IOException {
		int credit = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Practice8 p8 = new Practice8();
		boolean check = true;
		
		while (check) {
			System.out.println("***********");
			System.out.println("  1.����");
			System.out.println("  2.���");
			System.out.println("  3.�ܰ�");
			System.out.println("  4.����");
			System.out.println("***********");

			System.out.print("��ȣ ���� : ");
			int number = Integer.parseInt(br.readLine());
			switch (number) {
			case 1:
				credit = p8.input(credit);
				break;
			case 2:
				credit = p8.output(credit);
				break;
			case 3:
				System.out.println("����� �ܾ��� "+credit+"�� �Դϴ�.");
				break;
			case 4:
				System.out.println("���α׷��� �����մϴ�.");
				check = false;
				break;
			}
			System.out.println("");
		}
	}
	
	public int output(int credit) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("��ݾ�");
		int money = Integer.parseInt(br.readLine());
		if((credit-money) <0) {
			System.out.println("�ܾ��� �����մϴ�.");
		}else {
			credit = credit - money;
			System.out.println("����� �ܾ��� " +credit+"�� �Դϴ�.");
		}
		return credit;
	}
	
	public int input(int credit) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("���ݾ� :");
		int money = Integer.parseInt(br.readLine());
		if (money % 10000 == 0) {
			credit += money;
			System.out.println("����� �ܾ��� " + credit + "�� �Դϴ�.");
		} else {
			System.out.println("���� ������ �Է��ϼ���.");
		}
		return credit;
	}
}
