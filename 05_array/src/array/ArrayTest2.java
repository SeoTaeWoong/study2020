package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayTest2 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = (int)(Math.random()*9+2); // 2~10까지
		String[] ar;
		ar = new String[size]; // ar의 크기는 2~10까지 랜덤;
		
		System.out.println(ar);
		System.out.println(ar.length);
		for(int i=0; i<ar.length; i++) {
			System.out.print("과일명 입력: ");
			ar[i] = br.readLine();
		}
		
		System.out.println(ar);
		for(String c:ar) {
			System.out.println(c);
			System.out.println("첫번째 문자: "+c.charAt(0));
			System.out.println("문자열 크기 = "+c.length());
			System.out.println("마지막 위치 = "+c.indexOf("인"));
		}
	}
}
