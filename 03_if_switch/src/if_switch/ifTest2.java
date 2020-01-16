package if_switch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ifTest2 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("a값 입력 :");
		int su1 = Integer.parseInt(br.readLine());
		System.out.print("b값 입력 :");
		int su2 = Integer.parseInt(br.readLine());
		System.out.print("c값 입력 :");
		int su3 = Integer.parseInt(br.readLine());

		int max = 0;
		int c = 0;
		int min = 0;
		if (su1 > su2 && su1 > su3) {
			max = su1;
			if (su2 > su3) {
				min = su3;
				c = su2;
			} else {
				min = su2;
				c = su3;
			}
		} else if (su2 > su1 && su2 > su3) {
			max = su2;
			if (su1 > su3) {
				min = su3;
				c = su1;
			} else {
				min = su1;
				c = su3;
			}
		} else if (su3 > su1 && su3 > su2) {
			max = su3;
			if (su1 > su2) {
				min = su2;
				c = su1;
			} else {
				min = su1;
				c = su2;
			}
		}
		System.out.println(min +"\t"+ c +"\t" + max);

	}
}
