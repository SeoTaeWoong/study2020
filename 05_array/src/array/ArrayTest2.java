package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayTest2 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = (int)(Math.random()*9+2); // 2~10����
		String[] ar;
		ar = new String[size]; // ar�� ũ��� 2~10���� ����;
		
		System.out.println(ar);
		System.out.println(ar.length);
		for(int i=0; i<ar.length; i++) {
			System.out.print("���ϸ� �Է�: ");
			ar[i] = br.readLine();
		}
		
		System.out.println(ar);
		for(String c:ar) {
			System.out.println(c);
			System.out.println("ù��° ����: "+c.charAt(0));
			System.out.println("���ڿ� ũ�� = "+c.length());
			System.out.println("������ ��ġ = "+c.indexOf("��"));
		}
	}
}
