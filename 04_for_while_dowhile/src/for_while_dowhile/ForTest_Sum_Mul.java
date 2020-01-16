package for_while_dowhile;

public class ForTest_Sum_Mul {
	public static void main(String[] args) {
		
		int sum = 0;
		int sum1 =1;
		for(int i=1; i<=10;i++){
			sum= sum+i;
			sum1 *=i;
			System.out.println(i +" "+sum+" "+sum1);
		}
	}
}
