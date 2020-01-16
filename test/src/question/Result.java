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
	// 19번 문제 전용 함수 /////////////
	public void output(int a, char c) {
		for(int i=0;i<10;i++) {
			System.out.print(c);
		}
			
	}
	// 19번 문제 전용 함수 /////////////
	public void question18() {
		Result re = new Result();
		System.out.println("더하기:"+re.sum(3, 5));
		System.out.println("빼기:"+re.sub(7, 2));
		System.out.println("곱하기:"+re.mul(4, 5));
		System.out.println("나누기:"+re.div(7, 3));
	}
	// 18번 문제 전용 함수//////////////////////////////////////////
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
	//18번 문제 전용 메서드//////////////////////////////////////////
	
	
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
		System.out.print("x의 값을 입력하시오: ");
		int x = Integer.parseInt(br.readLine());
		System.out.print("y의 값을 입력하시오: ");
		int y = Integer.parseInt(br.readLine());
		int num = x;
		for (int i = 1; i < y; i++) {
			num *= y;
		}
		System.out.println(x + "의" + y + "승은" + num);

	}

	public static void question15() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("--출력--");

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
		System.out.println("*** 난수가 발생하였습니다.. 맞추어 보세요... ***");
		while (esc) {

			System.out.println();
			System.out.print("숫자 입력: ");
			input = sc.nextInt();
			if (a < input) {
				System.out.println("컴퓨터의 숫자가 더 작습니다.");
			} else if (a > input) {
				System.out.println("컴퓨터의 숫자가 더 큽니다.");
			} else if (a == input) {
				System.out.println("축하합니다. " + (count) + "번만에 맞추셨습니다...");
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
		System.out.println("--출력--");
		for (int i = 1; i <= 50; i++) {

			output = rand.nextInt(100);
			sum += output;
			System.out.print(String.format("%-4d", output));

			if (i % 6 == 0) {
				System.out.println();
			}

		}
		System.out.println("\n합 = " + sum);

	}

	public static void question12() {
		int year;

		System.out.print("년도 입력: ");
		year = sc.nextInt();

		if ((year % 4 == 0) && (year % 100 != 0) || year % 400 == 0) {
			System.out.println("윤년 입니다.");
		} else {
			System.out.println("평년 입니다.");
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

		System.out.print("중간고사를 입력하시오: ");
		score1 = sc.nextInt();
		System.out.print("기말고사를 입력하시오: ");
		score2 = sc.nextInt();
		System.out.print("레포트고사를 입력하시오: ");
		score3 = sc.nextInt();
		System.out.print("출석고사를 입력하시오: ");
		score4 = sc.nextInt();

		System.out.println("중간고사: " + score1);
		System.out.println("기말고사: " + score2);
		System.out.println("레포트: " + score3);
		System.out.println("출석: " + score4);

		result = ((((score1 + score2) / 2.0 * 60) / 100) + (score3 * 20.0 / 100.0) + (score4 * 20.0 / 100.0));
		System.out.printf("성적= %.2f", result);

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
		System.out.println("학점= " + rank);

		System.out.println("평가= " + appraisal);

	}

	public static void question10() {

		int a_Number;
		int b_Number;
		double result;
		char c;

		while (true) {

			System.out.println("A값을 입력하시오: ");
			a_Number = sc.nextInt();
			System.out.println("B값을 입력하시오: ");
			b_Number = sc.nextInt();
			System.out.println("연산자를 입력(+,-,*,/): ");
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
				System.out.println("연산자 error");
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

		System.out.println("--결과--");
		System.out.println("이름: " + name);
		System.out.println("성별: " + (gender == 'M' ? "남자" : "여자"));
		System.out.println("나이: " + age + "세");
		System.out.println("신장: " + tall + "cm");

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
			System.out.println("입력데이타오류");
		}

	}

	public static void question7() {

		int count1;
		System.out.println("점수 입력 : ");
		count1 = sc.nextInt();
		if (count1 < 0 || count1 > 100) {
			System.out.println("입력오류!!");
		} else {
			System.out.println("입력된 값 : " + count1);
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
		System.out.println("큰수" + (input_a < input_b ? input_a : input_b));

	}

	public static void question5() {

		String input_name;
		int kor;
		int eng;
		int mat;
		System.out.println("다음을 입력받아 계산하시오.");
		System.out.println("--입력--");
		System.out.println("input name : 민들래");
		System.out.println("kor : 90");
		System.out.println("eng : 70");
		System.out.println("mat : 75");

		System.out.println("이름 : ");
		input_name = sc.nextLine();
		System.out.println("kor : ");
		kor = sc.nextInt();
		System.out.println("eng : ");
		eng = sc.nextInt();
		System.out.println("mat : ");
		mat = sc.nextInt();
		System.out.println("\n--출력--");
		System.out.println("이름 : " + input_name);
		System.out.println("합계점수 : " + (kor + eng + mat));
		System.out.println("평균점수 : " + String.format(("%.1f"), (kor + eng + mat) / 3.0));
		sc.close();
	}

	public static void question4() {

		String name = "이효리";
		String department = "개발부";
		String position = "대리";
		int salary = 15000000;

		System.out.println("문제4. 각각변수에 대입하여 출력하시오.");
		System.out.println("\t조건1) data는 현빈, 개발부, 대리,1500000로 대입");
		System.out.println("\t      변수명은 각각 name,department,position,sal로 할것");
		System.out.println("\t조건2) 출력은 아래와 같은 메서드(함수)를 이용하시오.");

		System.out.println("--출력--");
		System.out.println("이름 : " + name);
		System.out.printf("부서 : %s \n", department);
		System.out.print("직위 : " + position + "\n");
		System.out.println("급여 : " + salary);

	}

	public static void question3() {

		int money = 1500000;
		int bonus = 55000;
		int tax = money / 10;
		int result = money + bonus - tax;
		System.out.println("문제3. 급여명세서를 작성하시오.");
		System.out.println("\t조건1) 기본급이 1,500,000원 수당이 55,000원 세금이 기본급의 10%");
		System.out.println("\t조건2) 실수령액 = 기본급+시간수당-세금");

		System.out.println("--출력--");
		System.out.println("실수령액: " + result);

	}

	public static void question2() {
		int money = 65430;
		System.out.println("문제2. 65430원을 만들기 위한 화폐의 갯수를 구하시오.");
		System.out.println("답: ");
		System.out.println("    만원= " + (money / 10000));
		System.out.println("    천원= " + (money / 1000 % 10));
		System.out.println("    백원= " + (money / 100 % 10));
		System.out.println("    십원= " + (money % 100 / 10));
		System.out.println("    일원= " + (money % 10));
	}

	public static void question1() {
		String a = "100";
		String b = "200";

		System.out.println("문제1. String형 a와 b의 값을 형변환해서 두수의 곱을 구하시오.");
		System.out.println("답: " + (Integer.parseInt(a) * Integer.parseInt(b)));
	}
}
