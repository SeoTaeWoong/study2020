package collection;

public class GenericTest2<T> {
	private T a;
	
	public GenericTest2(T a) {
		this.a = a;
	}
	public void setA(T a) {
		this.a = a;
	}
	public T getA() {
		return a;
		
	}

	public static void main(String[] args) {
		GenericTest2<?> aa = new GenericTest2<String>("ȫ�浿");
		String name = (String)aa.getA();
		System.out.println("�̸� = "+name);
		
		//aa.setA("ȫ�浿");
		
		GenericTest2<?> bb= new GenericTest2<Integer>(25);
		//int age = (Integer)bb.getA();//unAutoBoxing
		int age = (int)bb.getA();
		System.out.println("���� = "+age);

	}

}
