package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice2 {
	public static void main(String[] args) throws IOException{
		BufferedReader	bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("x�� �Է� : ");
		int x = Integer.parseInt(bf.readLine());
		System.out.print("y�� �Է� : ");
		int y = Integer.parseInt(bf.readLine());
		int gob = x; 
		//int gob = 1;
		//for(int i = 1; i<=y;i++){
		// 	gob *= x;
		//}
		for(int i = 1; i<y;i++)
		{
			gob = gob*x;
		}
		System.out.println(x+"��"+y+"�� "+ gob);
		
	}
}

