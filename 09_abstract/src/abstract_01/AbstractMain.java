package abstract_01;

public class AbstractMain extends AbstractTest{
	
	public void setName(String name) {
		this.name = name;
		
	}

	public static void main(String[] args) {
		//AbstractTest at = new AbstractTest();
		AbstractTest at = new AbstractMain();
		at.setName("ȫ�浿");
		System.out.println("�̸� ="+at.getName());
		

	}

}
