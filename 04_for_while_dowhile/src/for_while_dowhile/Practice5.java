package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Practice5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("�߰���縦 �Է��Ͻÿ� : ");
		int su1 = Integer.parseInt(br.readLine());
		System.out.print("�⸻��縦 �Է��Ͻÿ� : ");
		int su2 = Integer.parseInt(br.readLine());
		System.out.print("���������� �Է��Ͻÿ� : ");
		int su3 = Integer.parseInt(br.readLine());
		System.out.print("�⼮���� �Է��Ͻÿ� : ");
		int su4 = Integer.parseInt(br.readLine());
		

		double grades = ((su1+su2)/2.0*0.6) + su3*0.2 + su4*0.2;
		char rank;
		String rating = null;
		if(grades>=90&& grades <=100) {
			rank = 'A';
			rating = "excellent";
		}else if(grades>=80) {
			rank = 'B';
			rating = "excellent";
		}else if(grades>=70) {
			rank = 'C';
			rating = "good";
		}else if(grades>=60) {
			rank = 'D';
			rating = "good";
		}else {
			rank = 'F';
			rating = "poor";
		}
		
		System.out.println("���� = "+String.format("%.2f", grades));
		System.out.println("���� = "+rank);
		System.out.println("�� = "+rating);
	}
}
