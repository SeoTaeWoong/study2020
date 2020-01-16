package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForTest_Sosu {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.print("숫자 입력 : ");
			int num = Integer.parseInt(br.readLine());
			if (num == 0)	break;
			
			int count = 0;
			
			for(int i = 1; i<=num; i++) { // 1이거나 자기자신일때 
			
				if(num%i == 0 ) {
					count++;
				}
			
			}
			if(count != 2) {
				System.out.println(num +"은 소수가 아닙니다.");
			}else if(count == 2) {
				System.out.println(num +"은 소수 입니다");
			}
			
			System.out.println();

		}
		System.out.println("프로그램을 종료합니다.");

	}
}

/*
 * 
 * 
 * 
 * 
 * */
