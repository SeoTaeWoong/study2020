package for_while_dowhile;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Multiple {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			System.out.print("숫자 입력 : ");
			int su = Integer.parseInt(br.readLine()); // 문자열을 입력받아 int형으로 변환후  그 값을 su에 집어넣는다.
			if(su>0) { // su의 값이 0보다 클때 실행
				for(int i = 1; i<=7; i++) {
					System.out.print(su*i+" ");
				}
			}else if(su <0) { // su의 값이 0보다 작을때 실행
				continue; // 해당 반복문의 맨 끝으로 이동한다
			}else {// su의 값이 0과 같을때 실행
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			System.out.println();
		}

	}

}
