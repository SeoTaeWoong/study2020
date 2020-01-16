package instance;

public class Operator {
	public static void main(String[] args) {

		int a = 100;
		int score1 = 90;
		int score2 = 89;
		int score3 = 99;
		int score4 = 100;
		double result = ( ((score1+score2)/2.0*0.6) + (score3*0.2) + (score4*0.2));
		double result1 = ((score1+score2)/2.0*0.6);
		double result2 = (score3*20.0/100.0);
		double result3 = (score4*20.0/100.0);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result);
				
	}
}
