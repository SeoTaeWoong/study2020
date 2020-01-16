package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayTest3 {
	
	//입력
	public int input(int[] ar, BufferedReader br) throws IOException {
		int num =0;
		for(int i =0; i<ar.length; i++) {
			System.out.print("ar["+i+"] : ");
			ar[i] = Integer.parseInt(br.readLine());
			num += ar[i];
		}
		return num;
	}
	//최대값
	public int big(int[] ar) {
		int max = ar[0];
		for(int i : ar) if(max<i) max = i;
		return max;
	}
	//최소값
	public int small(int[] ar) {
		int min = ar[0];
		for(int i : ar) if(min>i) min = i;
		return min;
	}
	
	//출력
	public void output(int[] ar, int num, int max, int min) {
		for(int data : ar) System.out.println(data+" ");
		System.out.println();
		System.out.println("합 = "+num);
		System.out.println("최대값 = "+max);
		System.out.println("최소값 = "+min);
	}
	
	//메인
	public static void main(String[] args) throws IOException{
		ArrayTest3 at3 = new ArrayTest3();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("배열 크기 : ");
		int len = Integer.parseInt(br.readLine());
		int[] ar = new int[len] ;
		
		at3.output(ar,at3.input(ar,br),at3.big(ar), at3.small(ar));
	}
}

/*	int num = 0;
int max = 0;
int min = 0;*/
/*for(int i =0; i<ar.length; i++) {
System.out.print("ar["+i+"] : ");
ar[i] = Integer.parseInt(br.readLine());
num = num+ar[i];
}

max = ar[0];  min = ar[0]; //max = min = ar[0];
////for(int i =0; i<ar.length; i++) {
//if(max<ar[i]) max = ar[i];
//if(min>ar[i]) min = ar[i];
//}

for(int data:ar) {
System.out.print(data+"  ");
if(max<data) max = data;
if(min>data) min = data;
}
System.out.println();
System.out.println("합 = "+num);
System.out.println("최대값 = "+max);
System.out.println("최소값 = "+min);

*/
