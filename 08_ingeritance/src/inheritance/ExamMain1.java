package inheritance;

import java.util.Scanner;

public class ExamMain1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원수 입력 : ");
		int size = sc.nextInt();
		
		Exam[] exam1 = new Exam[size];//객체배열
		for(int i=0; i<size; i++) {
			exam1[i] = new Exam();
			exam1[i].compare();
		}
		System.out.println("이름\t1 2 3 4 5\t점수");
		for(int i=0; i<size; i++) {
			System.out.print(exam1[i].getName()+"\t");
			
			for(int j=0; j<exam1[i].getOx().length; j++) {
				System.out.print(exam1[i].getOx()[j]+" ");
			}
			System.out.println("\t"+exam1[i].getScore());
		}//for i
	}

}
