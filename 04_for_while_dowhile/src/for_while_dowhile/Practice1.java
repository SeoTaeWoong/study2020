package for_while_dowhile;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Practice1 {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int user = 0;
		int com = 0;
		String esc;

		for (;;) {

			System.out.print("����(1),����(2),��(3) �� ��ȣ �Է� : ");
			user = Integer.parseInt(bf.readLine());
			com = (int) (Math.random() * 3 + 1);

			if (user == com) {
				if (user == 1) {
					System.out.println("��ǻ��: ����   ��: ����");
				} else if (user == 2) {
					System.out.println("��ǻ��: ����  ��: ����");
				} else if (user == 3) {
					System.out.println("��ǻ��: ��    ��: ��");
				}
				System.out.println("You Draw!!");
				
			} else if (user == 1 && com == 2) {
				System.out.println("��ǻ��: ����   ��: ����");
				System.out.println("You Lose!!");
			} else if (user == 1 && com == 3) {
				System.out.println("��ǻ��: ��     ��: ����");
				System.out.println("You Win!!.");
				
				
			}else if (user == 2 && com == 1) {
				System.out.println("��ǻ��: ����   ��: ����");
				System.out.println("You Win!!.");
			} else if (user == 2 && com == 3) {
				System.out.println("��ǻ��: ��   ��: ����");
				System.out.println("You Lose!!");
				
				
			} else if (user == 3 && com == 1) {
				System.out.println("��ǻ��: ����     ��: ��");
				System.out.println("You Lose!!");
			} else if (user == 3 && com == 2) {
				System.out.println("��ǻ��: ����     ��: ��");
				System.out.println("You Win!!.");
			}
			System.out.print("�� �ҷ�(Y/N)");
			esc = bf.readLine();
			if (esc.charAt(0) == 'Y') {

			} else if(esc.charAt(0) == 'N'){
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}

		}
	}
}
