package for_while_dowhile;

public class ForTest_Sum {
	public static void main(String[] args) {
		System.out.println();
		int sum=0;
		int i;
		for(i=1;  i<=10; i++)
		{
			if(i%2 ==0) {
				sum= sum+i;
				System.out.print("+"+i);
			}else {
				sum= sum-i;
				System.out.print("-"+i);
			}
			
		}
		System.out.println(" = "+sum);
	}
}
