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

			System.out.print("가위(1),바위(2),보(3) 중 번호 입력 : ");
			user = Integer.parseInt(bf.readLine());
			com = (int) (Math.random() * 3 + 1);

			if (user == com) {
				if (user == 1) {
					System.out.println("컴퓨터: 가위   나: 가위");
				} else if (user == 2) {
					System.out.println("컴퓨터: 바위  나: 바위");
				} else if (user == 3) {
					System.out.println("컴퓨터: 보    나: 보");
				}
				System.out.println("You Draw!!");
				
			} else if (user == 1 && com == 2) {
				System.out.println("컴퓨터: 바위   나: 가위");
				System.out.println("You Lose!!");
			} else if (user == 1 && com == 3) {
				System.out.println("컴퓨터: 보     나: 가위");
				System.out.println("You Win!!.");
				
				
			}else if (user == 2 && com == 1) {
				System.out.println("컴퓨터: 가위   나: 바위");
				System.out.println("You Win!!.");
			} else if (user == 2 && com == 3) {
				System.out.println("컴퓨터: 보   나: 바위");
				System.out.println("You Lose!!");
				
				
			} else if (user == 3 && com == 1) {
				System.out.println("컴퓨터: 가위     나: 보");
				System.out.println("You Lose!!");
			} else if (user == 3 && com == 2) {
				System.out.println("컴퓨터: 바위     나: 보");
				System.out.println("You Win!!.");
			}
			System.out.print("또 할래(Y/N)");
			esc = bf.readLine();
			if (esc.charAt(0) == 'Y') {

			} else if(esc.charAt(0) == 'N'){
				System.out.println("프로그램을 종료합니다.");
				break;
			}

		}
	}
}
