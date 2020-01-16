package class_1;

class This{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
//-----------------------------------------------

public class ThisTest {
	
	public static void main(String[] args) {
		This t = new This();
		System.out.println("객체 t = "+t);
		t.setName("홍길동");
		t.setAge(18);
		System.out.println("이름: "+t.getName()+"\t 나이: "+t.getAge());
		System.out.println();
		
		Person bb = new Person();
		System.out.println(bb);
		bb.setName("코난");
		bb.setAge(16);
		System.out.println("이름 :"+bb.getName()+"\t\t  나이 :"+bb.getAge());
	}
}
