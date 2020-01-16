package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice4_1 {// 강사님 코드
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] com = new int[3];
		int[] user = new int[3];
		int ball = 0;
		int strike = 0;
		String inputStr;
		String yn;

		do {
			System.out.println("게임을 실행하시겠습니까?(Y/N)");
			yn = br.readLine();
		} while (!yn.equals("Y") && !yn.equals("y") && !yn.equals("N") && !yn.equals("n"));

		if (yn.equals("Y") || yn.equals("y")) {
			System.out.println();
			System.out.println("게임을 시작합니다.");

			for (int i = 0; i < com.length; i++) {
				com[i] = (int) (Math.random() * 9 + 1);
				for (int j = 0; j < i; j++) {
					if (com[i] == com[j]) {
						i--;
						break;
					}
				}
			}
			// 입력
			while (true) {
				System.out.println();
				System.out.println("숫자 입력: ");
				inputStr = br.readLine();
				for (int i = 0; i < user.length; i++) {
					user[i] = inputStr.charAt(i) - 48;
				}
				strike = ball = 0;
				for (int i = 0; i < com.length; i++) {
					for (int j = 0; j < user.length; j++) {
						if (com[i] == user[j]) {
							if (i == j)
								strike++;
							else
								ball++;
						}
					}
				}
				System.out.println(strike + "스트라이크  " + ball + "볼");
				if (strike == 3)
					break;
			}
		}
		System.out.println("프로그램 종료");
	}

}
