package array;

public class Practice1 {
	public static void main(String[] args) {
		char[] ch = new char[50];
		int[] count = new int[26];
		for(int i=0; i<ch.length; i++) {
			ch[i] = (char)(Math.random()*26+65);
			System.out.print(ch[i]+" ");
			if((i+1)%10==0) System.out.println();
		}
		
		for(int i=0; i<count.length; i++) {
			for(int j=0; j<ch.length;j++) {
				
				if(ch[j]==(char)(i+65)) {
					count[i]++;
				}
			}
		}
		System.out.println();
		for(int i =0; i<count.length; i++) {
			System.out.println((char)(i+65)+" : "+ count[i]);
		}
	}
}
