package method;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodTest3 {
	public static void main(String[] args) throws IOException{
		// �̸�, ����, ����, ������ �Է¹޾Ƽ� ������ ����� ���Ͻÿ�
		// ������ calcTot()���� ���ϰ�
		// ����� calcAvg()���� ���ؿ���
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name;
		int kor;
		int eng;
		int math;
		int total;
		double average;
		System.out.print("�̸� �Է�: ");
		name = br.readLine();
		System.out.print("���� �Է�: ");
		kor = Integer.parseInt(br.readLine());
		System.out.print("���� �Է�: ");
		eng = Integer.parseInt(br.readLine());
		System.out.print("���� �Է�: ");
		math = Integer.parseInt(br.readLine());
		MethodTest3 mt= new MethodTest3();
		total = mt.calcTot(kor, eng, math) ;
		average = mt.calcAvg(total);
		System.out.println("\t*** ȫ�浿 ����ǥ ***");
		System.out.println("����\t����\t����\t����\t���");
		System.out.printf("%d\t%d\t%d\t%d\t%.2f",kor,eng,math,total,average);
	}
	
	public int calcTot(int kor, int eng, int math) {
		return kor+eng+math;
	}
	public double calcAvg(int total) {
		return total/3.0;
		
	}
	
}

