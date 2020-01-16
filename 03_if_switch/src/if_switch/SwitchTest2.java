package if_switch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class SwitchTest2 {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("a값 입력 : ");
		int a = Integer.parseInt(bf.readLine());
		System.out.print("b값 입력 : ");
		int b = Integer.parseInt(bf.readLine());
		System.out.print("연산자(+,-,*,/) 입력 : ");
		String c = bf.readLine();

		switch (c.charAt(0)) {
		case '+':
			System.out.println(a + "+" + b + "=" + (a + b));
			break;
		case '-':
			System.out.println(a + "-" + b + "=" + (a - b));
			break;
		case '*':
			System.out.println(a + "*" + b + "=" + (a * b));
			break;
		case '/':
			//if(((double)a / b)) ==){
			//System.out.println(a + "/" + b + "=" + String.format("%.3f", ((double)a / b)));
			//}
			DecimalFormat df = new DecimalFormat("#.###");
			System.out.println(a + "/" + b + "=" + df.format((double)a / b));
			break;
		default:
			System.out.println("error");
		}

	}
}
