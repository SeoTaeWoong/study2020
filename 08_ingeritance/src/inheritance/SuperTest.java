package inheritance;

public class SuperTest {
	
	protected double weight, height;
	
	public SuperTest() {
		System.out.println("SuperTest �⺻ ������ �Դϴ�");
	}
	
	public SuperTest (double weight, double hight) {
		this.weight = weight;
		this.height = height;
	}

	public void disp() {
		System.out.println("������ = " +weight);
		System.out.println("Ű = "+height);
	}
}
