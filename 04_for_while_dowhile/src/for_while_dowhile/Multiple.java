package for_while_dowhile;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Multiple {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			System.out.print("���� �Է� : ");
			int su = Integer.parseInt(br.readLine()); // ���ڿ��� �Է¹޾� int������ ��ȯ��  �� ���� su�� ����ִ´�.
			if(su>0) { // su�� ���� 0���� Ŭ�� ����
				for(int i = 1; i<=7; i++) {
					System.out.print(su*i+" ");
				}
			}else if(su <0) { // su�� ���� 0���� ������ ����
				continue; // �ش� �ݺ����� �� ������ �̵��Ѵ�
			}else {// su�� ���� 0�� ������ ����
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			System.out.println();
		}

	}

}
