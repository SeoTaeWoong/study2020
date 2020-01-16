package inheritance;

import java.util.Scanner;

public class ExamMain {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int num[];
		System.out.println("인원수 입력 : ");
		num = new int[sc.nextInt()];
		Exam[] exam = new Exam[num.length];
		
		for(int i =0; i<num.length; i++) {
			exam[i] = new Exam();
		}
		System.out.println("이름\t1 2 3 4 5\t점수");
		for(Exam data : exam) {
			data.compare();
			
			System.out.print(data.getName()+"\t");
			for(int i=0; i<data.getOx().length; i++) {
					System.out.print(data.getOx()[i]+" ");
			}	System.out.println("\t"+data.getScore());			
		}
		
		
		//exam.compare();
		
		
		
		

	}

}
