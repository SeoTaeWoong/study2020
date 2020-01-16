package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice2 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] binary = new int[32];
		int count=0;
		int check = 1;
		while(true) {
			System.out.print("10진수 입력 : ");
			int su = Integer.parseInt(br.readLine());
			if(su > 0) {
				for(int i = 0; i<binary.length;i++)
				{//32번 확인해라
					if(su == 1 && check ==1 ) {
						binary[i] =1;
						count++;
						check = 0;
					}else if(su%2 == 1 && check ==1) {
						binary[i] = 1;
						su = su/2;
						count++;
					}else if(su%2 == 0 || check == 0) {
						binary[i] = 0;
						su=su/2;
						count++;
					} 
					if(check == 0 && (i+1)%4 ==0)
					{
						break; 
					}
				}
				int j = count; 
				for(int i = 0; i<j;i++) {
					System.out.print(binary[count-1]);
					if((count-1)%4==0) System.out.print(" ");
					count--;
				}
				System.out.println();
				
			}else if(su == 0) {
				break;
			} else {
				
			}
			count =0;
			check =1;
			for(int i =0; i<binary.length;i++) {
				binary[i] = 0;
			}// 몫이 0이면 0  // 나눈후 몫이 1이면 1
			//0010 0000 = 32
			// 32/2 == 16/2 ==   8/2 == 4/2 == 2/2   1
			//  1	     1        1      1      1    0
		}
	}
}
