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
//			System.out.print("숫자 입력: ");
//			int a = Integer.parseInt(br.readLine());
//			count++;
//
//			if (a > su_rand) {
//				System.out.println(a + "보다 작습니다.");
//			} else if (a < su_rand) {
//				System.out.println(a + "보다 큽니다.");
//			} else if (a == su_rand) {
//				System.out.println("딩동뎅 " + count + "번만에 맞추셨습니다.");
//				
//				do {
//					System.out.print("또 할래(Y/N) : ");
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
				System.out.print("숫자 입력: ");
				int a = Integer.parseInt(br.readLine());
				count++;

				if (a > su_rand) {
					System.out.println(a + "보다 작습니다.");
				} else if (a < su_rand) {
					System.out.println(a + "보다 큽니다.");
				} else if (a == su_rand) {
					System.out.println("딩동뎅 " + count + "번만에 맞추셨습니다.");
					break;
				}
			} // while문

			System.out.print("또 할래(Y/N): ");
			String check = br.readLine();

			if (check.equals("N") || check.equals("n")) {
				System.out.println("- - - - E N D - - - -");
				break;
			}
		} while (true); // do_while
	}
}
