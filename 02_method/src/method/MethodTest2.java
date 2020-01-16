package method;

import javax.print.attribute.standard.OutputDeviceAssigned;

public class MethodTest2 {
	
	public static void disp() { //����
		System.out.println("static method");
	}
	
	public void output() {
		System.out.println("non-static method");
		
	}
	
	public int plus(int su1, int su2) {
		return su1+su2;
	}
	public int minus(int su1, int su2) {
		return su1-su2;
	}
	public int multiply(int su1, int su2) {
		return su1*su2;
	}
	public double divide(int su1, int su2) {
		return (double)su1/su2;
	}
	
	
	public static void main(String[] args) {
		disp();
		
		MethodTest2 aa  =  new MethodTest2();
		aa.output();
		System.out.println(aa); // �޼ҵ�.Ŭ������@�ּ�(16����)
		System.out.println(aa.toString()); 
		System.out.println(aa.hashCode()); //�ּҰ��� 16���� - > 10������ ǥ��)
		
		int sum = aa.plus(25,36);
		int sub = aa.minus(35, 30);
		int mul = aa.multiply(30, 2);
		double div = aa.divide(30,	2);
		System.out.println("25+36= "+sum);
		System.out.println("35-30= "+sub);
		System.out.println("30*02= "+mul);
		System.out.println("30/02= "+div);
		
	}
}
