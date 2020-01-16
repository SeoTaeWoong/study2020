package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		LOOP:while (true) {

			System.out.print("������ �����Ͻðڽ��ϱ�(Y/N)");
			String input = br.readLine();
			int[] user = new int[3];
			if (input.equals("N") || input.equals("n"))	break;
			else if (input.equals("Y") || input.equals("y")) {
				System.out.println("������ �����մϴ�.");

				int[] computer = new int[3];
				for (int i = 0; i < computer.length; i++) {
					computer[i] = (int) (Math.random() * 9 + 1); // 1~9
					for (int j = 0; j < i; j++) {
						if (computer[i] == computer[j])
							i--;
					}
				}
				// �ݺ��� x
				while (true) {
					int ball_count = 0;
					int st_count = 0;
					System.out.print("�����Է� : ");
					int su = Integer.parseInt(br.readLine());
					for (int x = 0; x < 3; x++) {
						if (x == 0)
							user[x] = su / 100;
						else if (x == 1)
							user[x] = su % 100 / 10;
						else if (x == 2)
							user[x] = su % 10;
					}

					// ���� ���� ��ġ�°� �ִٸ� ball_count++
					// �迭�� ��� �� �ΰ��� ��ġ�� st_count++
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
					System.out.println(st_count + "��Ʈ����ũ" + ball_count + "��");
					if (st_count == 3) {
						break LOOP;
					}

				}

			} else continue;
		}
		System.out.println("���α׷� ����");
	}
}
