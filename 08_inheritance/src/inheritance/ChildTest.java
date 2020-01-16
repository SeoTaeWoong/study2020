package inheritance;

public class ChildTest extends SuperTest{
	private String name;
	private int age;

	public ChildTest() {
		System.out.println("ChildTest �⺻ ������");
	}
	public ChildTest(String name, int age, double weight, double height) {
		super(weight,height);
		this.name = name;
		this.age = age;
	}
	
	public void disp() {
		System.out.println("ChildTest");
		System.out.println("�̸�= " +name);
		System.out.println("����= " +age);
		System.out.println("������= " +weight);
		System.out.println("Ű= " +height);
	}
	
	public static void main(String[] args) {
		ChildTest aa = new ChildTest("��浿",25,79.5,185.3);
		aa.disp();
		System.out.println();
		
		SuperTest bb = new ChildTest("��ġ",16,54.2,167.4);
		bb.disp();
		
	}
}
