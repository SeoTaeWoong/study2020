package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberGame {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int su_rand;
	//	int end = 1;
		int count = 0;
//		su_rand = (int) (Math.random() * 100 + 1);
//		System.out.println("- - - - S T A R T - - - -");
//		while (true) {
//			end = 1;
//			System.out.println();
//			System.out.print("���� �Է�: ");
//			int a = Integer.parseInt(br.readLine());
//			count++;
//
//			if (a > su_rand) {
//				System.out.println(a + "���� �۽��ϴ�.");
//			} else if (a < su_rand) {
//				System.out.println(a + "���� Ů�ϴ�.");
//			} else if (a == su_rand) {
//				System.out.println("������ " + count + "������ ���߼̽��ϴ�.");
//				
//				do {
//					System.out.print("�� �ҷ�(Y/N) : ");
//					String check = br.readLine();
//					if (check.equals("N")) {
//						System.out.println("- - - - E N D - - - -");
//						end = 0;
//						break;
//					} else if (check.equals("Y")) {
//						su_rand = (int) (Math.random() * 100 + 1);
//						count = 0;
//						break;
//					}
//				} while (true);
//				
//				if (end == 0) {
//					break;
//				}
//
//			}
//		}
		do {// do_while
			su_rand = (int) (Math.random() * 100 + 1);
			count = 0;
			System.out.println("- - - - S T A R T - - - -");
			while (true) {

				System.out.println();
				System.out.print("���� �Է�: ");
				int a = Integer.parseInt(br.readLine());
				count++;

				if (a > su_rand) {
					System.out.println(a + "���� �۽��ϴ�.");
				} else if (a < su_rand) {
					System.out.println(a + "���� Ů�ϴ�.");
				} else if (a == su_rand) {
					System.out.println("������ " + count + "������ ���߼̽��ϴ�.");
					break;
				}
			} // while��

			System.out.print("�� �ҷ�(Y/N): ");
			String check = br.readLine();

			if (check.equals("N") || check.equals("n")) {
				System.out.println("- - - - E N D - - - -");
				break;
			}
		} while (true); // do_while
	}
}
