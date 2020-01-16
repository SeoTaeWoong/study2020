package inheritance;

import java.util.Scanner;

class ShapeTest{
	protected Scanner sc = new Scanner(System.in);
	protected double area;
	
	public ShapeTest() {
		System.out.println("ShapeTest �⺻������");
	}
	public void calcArea() {
		System.out.println("������ ����մϴ�");
	}
	public void dispArea() {
		System.out.println("������ ����մϴ�");
	}
}
//--------------
class SamTest extends ShapeTest{
	private int base, height;
	
	public SamTest() {
		System.out.println("SamTest �⺻������");
		System.out.print("�غ� : ");
		base = sc.nextInt();
		System.out.print("���� : ");
		height = sc.nextInt();
	}
	
	public void calcArea() {
		area = base*height/2.;
	}
	public void dispArea() {
		System.out.println("�ﰢ�� ���� = "+area);
	}
	
}
class SaTest extends ShapeTest{
	private int width, height;
	
	public SaTest() {
		System.out.println("SaTest �⺻������");
		System.out.print("���� : ");
		width = sc.nextInt();
		System.out.print("���� : ");
		height = sc.nextInt();
	}
	public void calArea() {
		area = width*height;
	}
	public void dispArea() {
		System.out.print("�簢���� ���� = "+area);
	}
}
class SadariTest extends ShapeTest{
	private int top, bottom, height;
	
	public SadariTest() {
		System.out.println("SadariTest �⺻������");
		System.out.println("���� : ");
		top = sc.nextInt();
		System.out.println("�غ� : ");
		bottom = sc.nextInt();
		System.out.println("���� : ");
		height =sc.nextInt();
	}
	public void calArea() {
		area  = ((top+bottom)*height)/2;
	}
	public void dsipArea(){
		System.out.println("��ٸ� = "+area);
	}
}
	
//--------------
//--------------
//--------------

public class ShapeMain {

	public static void main(String[] args) {
		/*
		SamTest sam = new SamTest();
		sam.calcArea();
		sam.dispArea();
		System.out.println();
		
		SaTest st = new SaTest();
		st.calArea();
		st.dispArea();
		System.out.println();
		
		SadariTest sa = new SadariTest();
		sa.calArea();
		sa.dsipArea();
		System.out.println();
		 */
		
		ShapeTest shape;
		shape = new SamTest();//���յ� ���߱�, �θ�=�ڽ�, �ڽ�=(�ڽ�)�θ� �����Ҽ��ִ�
		shape.calcArea();
		shape.dispArea();
		System.out.println();
		
		shape = new SaTest();
		shape.calcArea();
		shape.dispArea();
		System.out.println();
		
		shape = new SadariTest();
		shape.calcArea();
		shape.dispArea();
		System.out.println();

	}

}
