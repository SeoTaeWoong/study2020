package method;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodTest3 {
	public static void main(String[] args) throws IOException{
		// 이름, 국어, 영어, 수학을 입력받아서 총점과 평균을 구하시오
		// 총점을 calcTot()에서 구하고
		// 평균은 calcAvg()에서 구해오기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name;
		int kor;
		int eng;
		int math;
		int total;
		double average;
		System.out.print("이름 입력: ");
		name = br.readLine();
		System.out.print("국어 입력: ");
		kor = Integer.parseInt(br.readLine());
		System.out.print("영어 입력: ");
		eng = Integer.parseInt(br.readLine());
		System.out.print("수어 입력: ");
		math = Integer.parseInt(br.readLine());
		MethodTest3 mt= new MethodTest3();
		total = mt.calcTot(kor, eng, math) ;
		average = mt.calcAvg(total);
		System.out.println("\t*** 홍길동 석적표 ***");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.printf("%d\t%d\t%d\t%d\t%.2f",kor,eng,math,total,average);
	}
	
	public int calcTot(int kor, int eng, int math) {
		return kor+eng+math;
	}
	public double calcAvg(int total) {
		return total/3.0;
		
	}
	
}

