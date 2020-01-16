package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		LOOP:while (true) {

			System.out.print("게임을 실행하시겠습니까(Y/N)");
			String input = br.readLine();
			int[] user = new int[3];
			if (input.equals("N") || input.equals("n"))	break;
			else if (input.equals("Y") || input.equals("y")) {
				System.out.println("게임을 시작합니다.");

				int[] computer = new int[3];
				for (int i = 0; i < computer.length; i++) {
					computer[i] = (int) (Math.random() * 9 + 1); // 1~9
					for (int j = 0; j < i; j++) {
						if (computer[i] == computer[j])
							i--;
					}
				}
				// 반복값 x
				while (true) {
					int ball_count = 0;
					int st_count = 0;
					System.out.print("숫자입력 : ");
					int su = Integer.parseInt(br.readLine());
					for (int x = 0; x < 3; x++) {
						if (x == 0)
							user[x] = su / 100;
						else if (x == 1)
							user[x] = su % 100 / 10;
						else if (x == 2)
							user[x] = su % 10;
					}

					// 안의 값이 겹치는게 있다면 ball_count++
					// 배열의 행과 값 두개다 겹치면 st_count++
					for (int i = 0; i < computer.length; i++) {
						if (computer[i] == user[i]) {
							st_count++;
						} else if (computer[i] != user[i]) {
							for (int j = 0; j < user.length; j++) {
								if (computer[i] == user[j]) {
									ball_count++;
								}
							}
						}
					}
					System.out.println(st_count + "스트라이크" + ball_count + "볼");
					if (st_count == 3) {
						break LOOP;
					}

				}

			} else continue;
		}
		System.out.println("프로그램 종료");
	}
}
