package class_2;

import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		int index=-1; //위치
		int cnt =0;  // 개수
		System.out.print("문자열 입력: ");
		sb.append(sc.next().toLowerCase());
		System.out.print("현재 문자열 입력: ");
		String str = sc.next().toLowerCase();
		System.out.print("바꿀 문자열 입력: ");
		String str1 = sc.next().toLowerCase();
		if(sb.length()<str.length()) { 
			System.out.println("입력한 문자열의 크기가 작습니다.");
			return;
		}
		index = ~str.length();
		while(true) {
			if((index= sb.indexOf(str,index+str.length()))!=-1) cnt++;
			else break;
		}
		sb.replace(sb.indexOf(str), sb.indexOf(str)+str.length(), str1);

		System.out.println(sb);
		System.out.println(cnt+"번 치환");
		
	
	}
}
