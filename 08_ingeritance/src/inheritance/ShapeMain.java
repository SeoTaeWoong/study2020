package inheritance;

import java.util.Scanner;

class ShapeTest{
	protected Scanner sc = new Scanner(System.in);
	protected double area;
	
	public ShapeTest() {
		System.out.println("ShapeTest 기본생성자");
	}
	public void calcArea() {
		System.out.println("도형을 계산합니다");
	}
	public void dispArea() {
		System.out.println("도형을 출력합니다");
	}
}
//--------------
class SamTest extends ShapeTest{
	private int base, height;
	
	public SamTest() {
		System.out.println("SamTest 기본생성자");
		System.out.print("밑변 : ");
		base = sc.nextInt();
		System.out.print("높이 : ");
		height = sc.nextInt();
	}
	
	public void calcArea() {
		area = base*height/2.;
	}
	public void dispArea() {
		System.out.println("삼각형 넓이 = "+area);
	}
	
}
class SaTest extends ShapeTest{
	private int width, height;
	
	public SaTest() {
		System.out.println("SaTest 기본생성자");
		System.out.print("가로 : ");
		width = sc.nextInt();
		System.out.print("세로 : ");
		height = sc.nextInt();
	}
	public void calArea() {
		area = width*height;
	}
	public void dispArea() {
		System.out.print("사각형의 넓이 = "+area);
	}
}
class SadariTest extends ShapeTest{
	private int top, bottom, height;
	
	public SadariTest() {
		System.out.println("SadariTest 기본생성자");
		System.out.println("윗변 : ");
		top = sc.nextInt();
		System.out.println("밑변 : ");
		bottom = sc.nextInt();
		System.out.println("높이 : ");
		height =sc.nextInt();
	}
	public void calArea() {
		area  = ((top+bottom)*height)/2;
	}
	public void dsipArea(){
		System.out.println("사다리 = "+area);
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
		shape = new SamTest();//결합도 낮추기, 부모=자식, 자식=(자식)부모 참조할수있다
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
