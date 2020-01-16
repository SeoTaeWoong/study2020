package class_2;

public class StaticTest {
	private int a;
	private static int b;
	
	static {
		System.out.println("static�� �ʱ�ȭ����");
		b=3;
	}
	public StaticTest() {
		
	}
	public StaticTest(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void calc() {
		a++;
		b++;
	}
	public void disp() {
		System.out.println("a="+a+"\t b="+b);
	}
	
	public static void output() {
		System.out.println("Static Method...");
		//System.out.println("a="+a+"\t b="+b); static�޼��� �ȿ����� �Ϲ� �Լ����� ��� �� �� �� ����.
		StaticTest st = new StaticTest();
		st.a = 5;
		st.calc();
		st.disp();
	}
	public static void main(String[] args) {
		StaticTest st = new StaticTest();
		st.calc();
		st.disp();
		System.out.println();
		
		StaticTest st2 = new StaticTest();
		st2.calc();
		st2.disp();
		System.out.println();

		StaticTest st3 = new StaticTest();
		st3.calc();
		st3.disp();
		System.out.println();
		output();
	}
}
