package calc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test {
	public static void main(String[] args) throws IOException {
		 int sign = 0; // 부호가 몇개 들어있는지
		 String ept = "123+25487-321+-3247*8765";
		 String[] sNum;
		 int j=0;
		
		 for(int data = 0; data < ept.length();data++) {// ept에입력된 부호들의 갯수를 구하는 반복문
			if(ept.charAt(data) == '+' || ept.charAt(data) == '-' || ept.charAt(data) == '*' ||ept.charAt(data) == '/'||ept.charAt(data) == '%') { 
				if(ept.charAt(data+1) == '+' || ept.charAt(data+1) == '-') {
					
				}else sign++;
			}else if(ept.charAt(data) == '=' ) {
				 break;
			 }
		}
		 
		sNum = new String[sign+1]; //부호갯수+1 = 숫자가 들어갈 배열 방 갯수
		
		System.out.println(sign+1);
		for(int i=0; i<sNum.length;i++) { // i가 num.length보다 작을때까지 num.length가 4라면 0 1 2 3 까지 총 4번 반복
			sNum[i] = "";
			for(; j<ept.length(); j++) { //ept.charAt(i)로 부호가 나오기전까지 값을 집어넣는다.
				if(ept.charAt(j) == '+' || ept.charAt(j) == '-' || ept.charAt(j) == '*' ||ept.charAt(j) == '/'||ept.charAt(j) == '%') {
					j++;
					if(ept.charAt(j+1)=='+' || ept.charAt(j+1)=='-') {
						j++;
					}
					break;
				}else sNum[i] = sNum[i]+ept.charAt(j); //sNum[i]번째 값에 숫자를 집어넣어라
			}
		}
		
		System.out.println(sNum[2]);
	}
}
