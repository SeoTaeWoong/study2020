package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice3 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("숫자 입력: ");
		int su = Integer.parseInt(bf.readLine());
		
		for(int i = 1; i<=su; i++){
			
			if(su%i == 0){
				System.out.print(i+" ");
			}
			
		}
	}
}
