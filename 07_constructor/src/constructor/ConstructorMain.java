package constructor;



class ConstructorTest{
	private String name;
	private int age;
	
	public ConstructorTest() {
		System.out.println("�⺻������");
	}
	public ConstructorTest(int age) {
		this.age = age;
	}
	public ConstructorTest(String name) {
		this(15);
		this.name= name;
	}
	public String getName() { return name;}
	public int getAge(){return age;}
}
//-----------------------
public class ConstructorMain {
	public static void main(String[] args) {
		String a = new String("ȣ��");
		
		System.out.println(a);
	}
}
