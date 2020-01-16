package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		if(args.length!=0)System.out.println("args[0] ="+args[0]);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("숫자 입력 : ");
			int num2 = sc.nextInt();
		
			int num = Integer.parseInt(args[0]);
		
			System.out.println(num+" / "+num2+" = "+num/num2 );
		
		}catch(ArithmeticException e) {
			System.out.println("0으로 나누면 안된다");
		}catch(InputMismatchException e) {
			System.out.println("숫자만 입력하세요");
		}finally {
			System.out.println("error가 있건 업건 무조건 실행");
		}
		
		
	}

}
