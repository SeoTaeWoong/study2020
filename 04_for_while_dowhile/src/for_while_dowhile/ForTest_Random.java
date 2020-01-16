package for_while_dowhile;

public class ForTest_Random {
	public static void main(String[] args) {

			int rand;
			int i;
			int count=0;
			for(i = 1; i<=100; i++)
			{
				rand = (int)(Math.random()*26)+65;
				System.out.print((char)rand+"  ");
				if(i %10 == 0 ) System.out.println();
				
				if((char)rand == 'A') {
					count++;
				}
			}
			System.out.println("A는 "+count+"개 나왔습니다.");
			
	}
}

