package inheritance;

public class SubTest extends SuperTest{

	private String name;
	private int age;
	
	public SubTest(String name, int age, double weight, double height) {
		this.name = name;
		this.age = age;
		super.weight = weight;//this.weight = weight;
		super.height = height;//this.height = height;
	}
	
	public void output() {
		System.out.println("SubTest ������");
		System.out.println("�̸�= " +name);
		System.out.println("����= " +age);
		System.out.println("������= " +weight);
		System.out.println("Ű= " +height);
	}
	
	public SubTest() {
		System.out.println("SubTest �⺻ ������");
	}
	public static void main(String[] args) {
		SubTest aa = new SubTest("��浿",25,79.5,185.3);
		aa.output();
		System.out.println("--------------");
		aa.disp();//������ ã�� ������ �θ����� ���� ã�´�.
		System.out.println("");
		
		SuperTest bb = new SubTest("��ġ",16,52.3,162.3); // superTest�� �����ϱ� ������
		// bb.output()�� ������ �ɸ���.
		bb.disp();
		
	}
}
