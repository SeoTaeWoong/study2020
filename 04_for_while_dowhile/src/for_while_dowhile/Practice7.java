package for_while_dowhile;

import java.util.Scanner;

public class Practice7 {
	public static void main(String[] args) {
		int dan = 2;
		int count = 0;
		int su;

		for (int i = 1; i <= 3; i++) {

			for (su = 1; su <= 9; su++) {

				for (dan = 2+count; dan < 5+count; dan++) {
					if(dan == 10)break;
					System.out.print(dan + "*" + su + "=" + dan * su + "\t");
				}
				System.out.println();
			}
			System.out.println();
			count += 3;
		}
	}
}
