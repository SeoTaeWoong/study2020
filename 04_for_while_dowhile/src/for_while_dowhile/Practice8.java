package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice8 {
	public static void main(String[] args) throws IOException {
		int credit = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Practice8 p8 = new Practice8();
		boolean check = true;
		
		while (check) {
			System.out.println("***********");
			System.out.println("  1.예금");
			System.out.println("  2.출금");
			System.out.println("  3.잔고");
			System.out.println("  4.종료");
			System.out.println("***********");

			System.out.print("번호 선택 : ");
			int number = Integer.parseInt(br.readLine());
			switch (number) {
			case 1:
				credit = p8.input(credit);
				break;
			case 2:
				credit = p8.output(credit);
				break;
			case 3:
				System.out.println("당신의 잔액은 "+credit+"원 입니다.");
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				check = false;
				break;
			}
			System.out.println("");
		}
	}
	
	public int output(int credit) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("출금액");
		int money = Integer.parseInt(br.readLine());
		if((credit-money) <0) {
			System.out.println("잔액이 부족합니다.");
		}else {
			credit = credit - money;
			System.out.println("당신의 잔액은 " +credit+"원 입니다.");
		}
		return credit;
	}
	
	public int input(int credit) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("예금액 :");
		int money = Integer.parseInt(br.readLine());
		if (money % 10000 == 0) {
			credit += money;
			System.out.println("당신의 잔액은 " + credit + "원 입니다.");
		} else {
			System.out.println("만원 단위로 입력하세요.");
		}
		return credit;
	}
}
