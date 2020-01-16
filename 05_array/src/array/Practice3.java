package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
//로또
public class Practice3 {

	public void input(int[] randNum) {
		// 난수 발생 중복된 숫자가 나오면 다시 발생
		for (int i = 0; i < randNum.length; i++) {
			randNum[i] = (int) (Math.random() * 45 + 1);
			for(int j = 0; j<i; j++) {
				if(randNum[i] == randNum[j]) {
					i--;
					break;
				}
			}
		}
	}

	public void output(int[] randNum) {
		for(int i = 0 ; i<randNum.length;i++) {
			System.out.printf("%02d ",randNum[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) throws IOException{
		int[] randNum = new int[6];
		int money=0;
		int count;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("현금 입력: ");
		money = Integer.parseInt(br.readLine());
		Practice3 p3 = new Practice3();
		
		if(money%1000 == 0) {
			count = money/1000;
			for(int i = 1; i <= count; i++) {
				p3.input(randNum);
//				Arrays.sort(randNum);
				p3.sort(randNum);
				p3.output(randNum);
				if(i%5 == 0) System.out.println();
			}
		}		
		
	}

	private void sort(int[] randNum) {
		int temp = randNum[0];
		
		for(int i=0; i< (randNum.length-1);i++) {
			for(int j =i+1; j<randNum.length; j++) {
				if(randNum[i] > randNum[j]) {
					temp = randNum[i];
					randNum[i] = randNum[j];
					randNum[j] = temp;
				}
			}
		}
		
	}

}



/*int i=0;  int j = 0;
for (; i < randNum.length; i++) {
	for (j = 0; j < randNum.length; j++) {
		if (i == j) {
		} else if(randNum[i] != randNum[j]){
			count++;
		} else if(randNum[i] == randNum[j]) {
			randNum[j] = (int) (Math.random() * 45 + 1);
		}
	}
}

if(count ==(i*j-j)) {
	break;
}*/ // 비교후 같으면 재발생