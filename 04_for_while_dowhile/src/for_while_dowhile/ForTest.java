package for_while_dowhile;

public class ForTest {
	public static void main(String[] args) {
		int i = 1;
		for(; i<=10 ; i++)	{
			System.out.println("hello"+ i);
		}
		System.out.println("Å»Ãâ i = "+i);
	
		for(i = 10 ;i>0;i--){
			System.out.print(i+" ");
		}
		System.out.println();
		
		//A B C D E F G ... X Y Z
		for(i = 65; i<='Z'; i++){
			System.out.print((char)i+" ");
		}
	}
}
