package study_teacher;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		
		char a[]= new char[5];
		String dap = "11111";
		String JUNG = "11211";
		int score = 0;
		
		for(int i =0; i<5;i++) {
			if(dap.charAt(i) == JUNG.charAt(i)) {
				a[i] = 'O';
				score += 20;
			}else a[i] = 'X';
		}
		for(char data : a) {
			System.out.println(a);
		}
	}
	
}
