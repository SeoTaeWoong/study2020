package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.*;

public class InputTest {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String su;
		
		System.out.print("문자열 데이터 입력: ");
		su = br.readLine();
		
		System.out.print("정수 데이터 입력: ");
		int aa = Integer.parseInt(br.readLine());
		System.out.print("실수 데이터 입력: ");
		double bb = Double.parseDouble(br.readLine());
		System.out.println(su);
		System.out.println(aa);
		System.out.println(bb);
		
	}
}
