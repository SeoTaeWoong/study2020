package question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class Result {
	static Scanner sc = new Scanner(System.in);
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		/*
		 * question1(); System.out.println(); question2(); System.out.println();
		 * question3(); System.out.println(); question4(); System.out.println();
		 * question5();
		 */
		question17();
	}

	public void question19() {
		output(10,'#');
		question18();
	}
	// 19�� ���� ���� �Լ� /////////////
	public void output(int a, char c) {
		for(int i=0;i<10;i++) {
			System.out.print(c);
		}
			
	}
	// 19�� ���� ���� �Լ� /////////////
	public void question18() {
		Result re = new Result();
		System.out.println("���ϱ�:"+re.sum(3, 5));
		System.out.println("����:"+re.sub(7, 2));
		System.out.println("���ϱ�:"+re.mul(4, 5));
		System.out.println("������:"+re.div(7, 3));
	}
	// 18�� ���� ���� �Լ�//////////////////////////////////////////
	public int sum(int a, int b) {
		return a+b;
	}
	public int sub(int a, int b) {
		return a-b;
	}
	public int mul(int a, int b) {
		return a*b;
	}
	public String div(int a, int b) {
		return String.format("%.2f", (double)a/b);
	}
	//18�� ���� ���� �޼���//////////////////////////////////////////
	
	
	public static void question17() {

		for (int i = 0; i < 6; i++) {
			int count = 1;
			for (int y = 0; y < 4 + i; y++)
				if (y > 4 - i) {
					System.out.print(count);
					count++;
				} else {
					System.out.print(" ");
				}
			System.out.println();
		}

		for (int i = 0; i < 6; i++) {
			int count = 1;
			for (int y = -1; y < 7 - i; y++) {

				if (y < i) {
					System.out.print(" ");
				} else {
					System.out.print(count);
					count++;
				}
			}
			System.out.println();
		}

	}

	public void question16() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("x�� ���� �Է��Ͻÿ�: ");
		int x = Integer.parseInt(br.readLine());
		System.out.print("y�� ���� �Է��Ͻÿ�: ");
		int y = Integer.parseInt(br.readLine());
		int num = x;
		for (int i = 1; i < y; i++) {
			num *= y;
		}
		System.out.println(x + "��" + y + "����" + num);

	}

	public static void question15() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("--���--");

		for (int i = 1; i < 100; i++) {
			if (i % 3 == 0 && i % 7 == 0) {
				System.out.print(i + " ");
			}
		}

	}

	public static void question14() {

		int a = (int) (Math.random() * 100);

		boolean esc = true;
		int input;
		int count = 1;
		System.out.println("*** ������ �߻��Ͽ����ϴ�.. ���߾� ������... ***");
		while (esc) {

			System.out.println();
			System.out.print("���� �Է�: ");
			input = sc.nextInt();
			if (a < input) {
				System.out.println("��ǻ���� ���ڰ� �� �۽��ϴ�.");
			} else if (a > input) {
				System.out.println("��ǻ���� ���ڰ� �� Ů�ϴ�.");
			} else if (a == input) {
				System.out.println("�����մϴ�. " + (count) + "������ ���߼̽��ϴ�...");
				esc = false;
			}
			count++;
			System.out.println("");

		}

	}

	public static void question13() {

		Random rand = new Random();
		int output = 0;
		int sum = 0;
		System.out.println("--���--");
		for (int i = 1; i <= 50; i++) {

			output = rand.nextInt(100);
			sum += output;
			System.out.print(String.format("%-4d", output));

			if (i % 6 == 0) {
				System.out.println();
			}

		}
		System.out.println("\n�� = " + sum);

	}

	public static void question12() {
		int year;

		System.out.print("�⵵ �Է�: ");
		year = sc.nextInt();

		if ((year % 4 == 0) && (year % 100 != 0) || year % 400 == 0) {
			System.out.println("���� �Դϴ�.");
		} else {
			System.out.println("��� �Դϴ�.");
		}
	}

	public static void question11() {

		int score1;
		int score2;
		int score3;
		int score4;
		double result;
		char rank;
		String appraisal;

		System.out.print("�߰���縦 �Է��Ͻÿ�: ");
		score1 = sc.nextInt();
		System.out.print("�⸻��縦 �Է��Ͻÿ�: ");
		score2 = sc.nextInt();
		System.out.print("����Ʈ��縦 �Է��Ͻÿ�: ");
		score3 = sc.nextInt();
		System.out.print("�⼮��縦 �Է��Ͻÿ�: ");
		score4 = sc.nextInt();

		System.out.println("�߰����: " + score1);
		System.out.println("�⸻���: " + score2);
		System.out.println("����Ʈ: " + score3);
		System.out.println("�⼮: " + score4);

		result = ((((score1 + score2) / 2.0 * 60) / 100) + (score3 * 20.0 / 100.0) + (score4 * 20.0 / 100.0));
		System.out.printf("����= %.2f", result);

		if (result >= 90) {
			rank = 'A';
		} else if (result >= 80) {
			rank = 'B';
		} else if (result >= 70) {
			rank = 'C';
		} else if (result >= 60) {
			rank = 'D';
		} else {
			rank = 'F';
		}

		switch (rank) {
		case 'A':
			appraisal = "excellent";
			break;
		case 'B':
			appraisal = "excellent";
			break;
		case 'C':
			appraisal = "good";
			break;
		case 'D':
			appraisal = "good";
			break;
		default:
			appraisal = "poor";

			break;

		}
		System.out.println("����= " + rank);

		System.out.println("��= " + appraisal);

	}

	public static void question10() {

		int a_Number;
		int b_Number;
		double result;
		char c;

		while (true) {

			System.out.println("A���� �Է��Ͻÿ�: ");
			a_Number = sc.nextInt();
			System.out.println("B���� �Է��Ͻÿ�: ");
			b_Number = sc.nextInt();
			System.out.println("�����ڸ� �Է�(+,-,*,/): ");
			c = sc.next().charAt(0);

			if (c == '+') {
				result = a_Number + b_Number;
				System.out.println(a_Number + "+" + b_Number + "=" + (int) result);
			} else if (c == '-') {
				result = a_Number - b_Number;
				System.out.println(a_Number + "-" + b_Number + "=" + (int) result);
			} else if (c == '*') {
				result = a_Number * b_Number;
				System.out.println(a_Number + "*" + b_Number + "=" + (int) result);
			} else if (c == '/') {
				result = (double) a_Number / b_Number;
				System.out.println(a_Number + "/" + b_Number + "=" + result);
			} else {
				System.out.println("������ error");
			}

		}

	}

	public static void question9() {

		String name;
		char gender;
		int age;
		double tall;

		System.out.println("Input name: ");
		name = sc.nextLine();
		System.out.println("Input gender: ");
		gender = sc.next().charAt(0);
		System.out.println("Input age: ");
		age = sc.nextInt();
		System.out.println("Input tall: ");
		tall = sc.nextDouble();

		System.out.println("--���--");
		System.out.println("�̸�: " + name);
		System.out.println("����: " + (gender == 'M' ? "����" : "����"));
		System.out.println("����: " + age + "��");
		System.out.println("����: " + tall + "cm");

	}

	public static void question8() {
		char s;
		char result;
		System.out.println("input character: ");
		s = sc.next().charAt(0);
		if (s >= 97 && s <= 123) {
			result = (char) (s - 32);
			System.out.println("result: " + result);
		} else if (s >= 65 && s <= 91) {
			result = (char) (s + 32);
			System.out.println("result: " + result);
		} else {
			System.out.println("�Էµ���Ÿ����");
		}

	}

	public static void question7() {

		int count1;
		System.out.println("���� �Է� : ");
		count1 = sc.nextInt();
		if (count1 < 0 || count1 > 100) {
			System.out.println("�Է¿���!!");
		} else {
			System.out.println("�Էµ� �� : " + count1);
		}
	}

	public static void question6() throws IOException {

		int input_a;
		int input_b;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("input a:");
		input_a = br.read();

		System.out.println("input b:");
		input_b = br.read();
		System.out.println("ū��" + (input_a < input_b ? input_a : input_b));

	}

	public static void question5() {

		String input_name;
		int kor;
		int eng;
		int mat;
		System.out.println("������ �Է¹޾� ����Ͻÿ�.");
		System.out.println("--�Է�--");
		System.out.println("input name : �ε鷡");
		System.out.println("kor : 90");
		System.out.println("eng : 70");
		System.out.println("mat : 75");

		System.out.println("�̸� : ");
		input_name = sc.nextLine();
		System.out.println("kor : ");
		kor = sc.nextInt();
		System.out.println("eng : ");
		eng = sc.nextInt();
		System.out.println("mat : ");
		mat = sc.nextInt();
		System.out.println("\n--���--");
		System.out.println("�̸� : " + input_name);
		System.out.println("�հ����� : " + (kor + eng + mat));
		System.out.println("������� : " + String.format(("%.1f"), (kor + eng + mat) / 3.0));
		sc.close();
	}

	public static void question4() {

		String name = "��ȿ��";
		String department = "���ߺ�";
		String position = "�븮";
		int salary = 15000000;

		System.out.println("����4. ���������� �����Ͽ� ����Ͻÿ�.");
		System.out.println("\t����1) data�� ����, ���ߺ�, �븮,1500000�� ����");
		System.out.println("\t      �������� ���� name,department,position,sal�� �Ұ�");
		System.out.println("\t����2) ����� �Ʒ��� ���� �޼���(�Լ�)�� �̿��Ͻÿ�.");

		System.out.println("--���--");
		System.out.println("�̸� : " + name);
		System.out.printf("�μ� : %s \n", department);
		System.out.print("���� : " + position + "\n");
		System.out.println("�޿� : " + salary);

	}

	public static void question3() {

		int money = 1500000;
		int bonus = 55000;
		int tax = money / 10;
		int result = money + bonus - tax;
		System.out.println("����3. �޿������� �ۼ��Ͻÿ�.");
		System.out.println("\t����1) �⺻���� 1,500,000�� ������ 55,000�� ������ �⺻���� 10%");
		System.out.println("\t����2) �Ǽ��ɾ� = �⺻��+�ð�����-����");

		System.out.println("--���--");
		System.out.println("�Ǽ��ɾ�: " + result);

	}

	public static void question2() {
		int money = 65430;
		System.out.println("����2. 65430���� ����� ���� ȭ���� ������ ���Ͻÿ�.");
		System.out.println("��: ");
		System.out.println("    ����= " + (money / 10000));
		System.out.println("    õ��= " + (money / 1000 % 10));
		System.out.println("    ���= " + (money / 100 % 10));
		System.out.println("    �ʿ�= " + (money % 100 / 10));
		System.out.println("    �Ͽ�= " + (money % 10));
	}

	public static void question1() {
		String a = "100";
		String b = "200";

		System.out.println("����1. String�� a�� b�� ���� ����ȯ�ؼ� �μ��� ���� ���Ͻÿ�.");
		System.out.println("��: " + (Integer.parseInt(a) * Integer.parseInt(b)));
	}
}
