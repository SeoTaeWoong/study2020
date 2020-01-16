package instance;

import java.io.*;
class Ex12 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int mid, fin, report, attend;
		double score;
		char grade;
		String app=null;
		
		System.out.print("�߰���縦 �Է��Ͻÿ� : ");	mid=Integer.parseInt(br.readLine());
		System.out.print("�⸻��縦 �Է��Ͻÿ� : ");	fin=Integer.parseInt(br.readLine());
		System.out.print("����Ʈ������ �Է��Ͻÿ� : ");	report=Integer.parseInt(br.readLine());
		System.out.print("�⼮������ �Է��Ͻÿ� : ");	attend=Integer.parseInt(br.readLine());
		System.out.println();
		
		System.out.println("�߰���� : " + mid);
		System.out.println("�⸻��� : " + fin);
		System.out.println("����Ʈ : " + report);
		System.out.println("�⼮ : " + attend);
		System.out.println();
		
		score = (double)(mid + fin) / 2 * 0.6 + report * 0.2 + attend * 0.2;
		if(score >= 90)
			grade = 'A';
		else if(score >= 80)
			grade = 'B';
		else if(score >= 70)
			grade = 'C';
		else if(score >= 60)
			grade = 'D';
		else
			grade = 'F';
		
		switch (grade)
		{
			case 'A' : 
			case 'B' : app = "excellent"; break;
			case 'C' :
			case 'D' : app = "good"; break;
			case 'F' : app = "poor";
		}
		
		System.out.printf("���� : %.2f\n", score);
		System.out.println("���� : " + grade);
		System.out.println("�� : " + app);
	}
}
