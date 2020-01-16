package method;

import org.omg.CORBA.INTERNAL;

public class MethodTest {
	
	
	public static void main(String[] args) {
		int big  = Math.max(25,36);
		System.out.println("큰값"+big);
		
		int small = Math.min(25, 36);
		System.out.println("작은값"+small);
		
		double power = Math.pow(2, 5);
		System.out.println("2의5승"+ (int)power);
		
		//난수 - 컴퓨터가 불규칙하게 발생시키는 수 , 0.0<= 난수 < 1.0
		int a = (int)(Math.random()*25+66);
		System.out.println(a);
		
		System.out.println('2' + '5');
		System.out.println(('2'-48) + ('5'-48));
		System.out.println('2'-48 + '5'-48);
		
		System.out.println("2"+"5.7");
		System.out.println(Integer.parseInt("2") + Double.parseDouble("5.7"));
	
	}
	
	
	
}
