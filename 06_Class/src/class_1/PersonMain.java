package class_1;

class Person{
	private String name;
	private int age;
	public void setName(String name) {//����
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setData(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void setData() {
		
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	
	
}
//-----------------
public class PersonMain {
	public static void main(String[] args) {
		Person aa = new Person();
		System.out.println(aa);
		aa.setName("ȫ�浿");//ȣ��
		aa.setAge(25);
		System.out.println("�̸� :"+aa.getName()+"  ���� :"+aa.getAge());
		Person bb = new Person();
		System.out.println(bb);
		bb.setName("�ڳ�");
		bb.setAge(16);
		System.out.println("�̸� :"+bb.getName()+"  ���� :"+bb.getAge());
		Person cc = new Person();
		System.out.println(cc);
		cc.setData("��ġ",30);
		System.out.println("�̸� :"+cc.getName()+"  ���� :"+cc.getAge());
		
		Person dd = new Person();
		System.out.println(dd);
		dd.setData();
		System.out.println("�̸� :"+dd.getName()+"  ���� :"+dd.getAge());
				
	}
}
