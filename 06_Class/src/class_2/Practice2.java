package class_2;

import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		int index=-1; //��ġ
		int cnt =0;  // ����
		System.out.print("���ڿ� �Է�: ");
		sb.append(sc.next().toLowerCase());
		System.out.print("���� ���ڿ� �Է�: ");
		String str = sc.next().toLowerCase();
		System.out.print("�ٲ� ���ڿ� �Է�: ");
		String str1 = sc.next().toLowerCase();
		if(sb.length()<str.length()) { 
			System.out.println("�Է��� ���ڿ��� ũ�Ⱑ �۽��ϴ�.");
			return;
		}
		index = ~str.length();
		while(true) {
			if((index= sb.indexOf(str,index+str.length()))!=-1) cnt++;
			else break;
		}
		sb.replace(sb.indexOf(str), sb.indexOf(str)+str.length(), str1);

		System.out.println(sb);
		System.out.println(cnt+"�� ġȯ");
		
	
	}
}
