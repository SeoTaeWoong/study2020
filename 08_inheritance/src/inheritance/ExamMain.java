package inheritance;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class ExamMain {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Exam[] ex;
		System.out.println("�ο��� �Է� : ");
		ex = new Exam[Integer.parseInt(br.readLine())];
		for(int i = 0 ; i<ex.length; i++) {
			ex[i] = new Exam();
		}
		System.out.println("�̸�\t1  2  3  4  5    ����");
		for(Exam data : ex) {
			System.out.print(data.getName()+"\t");
			data.compare();
			for(int i =0 ; i<data.getOx().length; i++) {
				System.out.print(data.getOx()[i]+"  ");
			}
			System.out.println(data.getScore());
		}
		
		
	}
	
	
}
