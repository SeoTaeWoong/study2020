package inheritance;

public class SuperTest {
	protected double weight, height;
	
	public SuperTest() {
		System.out.println("suferTest�� �⺻ ������ �Դϴ�.");
	}
	public SuperTest(double weight, double height) {
		this.weight = weight;
		this.height = height;
	}
	
	public void disp(){
		System.out.println("������= "+weight);
		System.out.println("Ű= "+height);
	}
}
