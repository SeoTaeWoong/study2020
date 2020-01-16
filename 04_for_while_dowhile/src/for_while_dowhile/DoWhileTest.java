package for_while_dowhile;

public class DoWhileTest {
	public static void main(String[] args) {
		
		int a=0;
		do {
			a++;
			System.out.print(a+" ");
		}while(a<10);
		System.out.println();

		char ch = 'A';
		int count = 1;
		do {
			System.out.print(ch+" ");
			if(count%7 ==0)
			{
				System.out.println();
			}
			
			count++;
			ch++;
		}while(ch <= 'Z');
		
	}
}
