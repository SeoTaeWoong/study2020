package for_while_dowhile;

public class ForTest_LCM {
	public static void main(String[] args) {

		int lcm;
		int count = 0;
		int sum = 0;

		for (int i = 0; i < 100; i++) {
			lcm = (int) (Math.random() * 500 + 1);
			if (lcm % 2 == 0 && lcm % 3 == 0) {
				count++;
				sum += lcm;
				System.out.print(lcm + "\t");
				if(count%7==0) System.out.println();
			}
		}
		System.out.println();
		System.out.println("2와 3의 공배수 개수 = " + count);
		System.out.println("2와 3의 공배수 합 = " + sum);

	}
}
