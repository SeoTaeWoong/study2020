package method;

import org.omg.CORBA.INTERNAL;

public class MethodTest {
	
	
	public static void main(String[] args) {
		int big  = Math.max(25,36);
		System.out.println("ū��"+big);
		
		int small = Math.min(25, 36);
		System.out.println("������"+small);
		
		double power = Math.pow(2, 5);
		System.out.println("2��5��"+ (int)power);
		
		//���� - ��ǻ�Ͱ� �ұ�Ģ�ϰ� �߻���Ű�� �� , 0.0<= ���� < 1.0
		int a = (int)(Math.random()*25+66);
		System.out.println(a);
		
		System.out.println('2' + '5');
		System.out.println(('2'-48) + ('5'-48));
		System.out.println('2'-48 + '5'-48);
		
		System.out.println("2"+"5.7");
		System.out.println(Integer.parseInt("2") + Double.parseDouble("5.7"));
	
	}
	
	
	
}
