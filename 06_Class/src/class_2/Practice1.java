package class_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Practice1 {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt=0;
		int dex=-1;
		
		System.out.print("문자열 입력: ");
		String str = br.readLine();
		str = str.toLowerCase();
		System.out.print("현재 문자열 입력: ");
		String str1 = br.readLine();
		str1 = str1.toLowerCase();
		System.out.print("바꿀 문자열 입력: ");
		String reStr = br.readLine();
		reStr = reStr.toLowerCase();
		if(str.length() < str1.length()) {
			System.out.println("입력한 문자열의 크기가 작습니다.");
		}else {
			dex=~str1.length();
			while(true) {
				if((dex = str.indexOf(str1,dex+str1.length())) != -1) {
					cnt++;
				}else break;
			}
			str = str.replace(str.substring(str.indexOf(str1) ,str.indexOf(str1)+str1.length()), reStr);
			System.out.println(str);
			System.out.println(cnt+"번 치환");
		}
	}
}
