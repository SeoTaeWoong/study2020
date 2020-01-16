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
		System.out.println("SubTest 생성자");
		System.out.println("이름= " +name);
		System.out.println("나이= " +age);
		System.out.println("몸무게= " +weight);
		System.out.println("키= " +height);
	}
	
	public SubTest() {
		System.out.println("SubTest 기본 생성자");
	}
	public static void main(String[] args) {
		SubTest aa = new SubTest("고길동",25,79.5,185.3);
		aa.output();
		System.out.println("--------------");
		aa.disp();//나부터 찾고 없으면 부모한테 가서 찾는다.
		System.out.println("");
		
		SuperTest bb = new SubTest("또치",16,52.3,162.3); // superTest를 참조하기 때문에
		// bb.output()은 에러가 걸린다.
		bb.disp();
		
	}
}
