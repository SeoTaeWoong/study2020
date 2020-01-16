package constructor;

import java.util.Random;

public class RandomTest {
	public RandomTest() {
		System.out.println("난수 = "+ Math.random());
		System.out.println("난수 = "+ new Random().nextDouble());
		System.out.println("난수 = "+ new Random().nextInt(10));
	}
	
	public static void main(String[] args) {	
		
		
		RandomTest rt = new RandomTest();
		String a = "12";
		String b = "12";
		
		System.out.println(a==b);
		
	}
}
