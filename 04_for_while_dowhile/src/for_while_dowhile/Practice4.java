package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		
		int count = 0;
		int score = 0;
		int x=0;
		boolean t_f = true;
		do {
			
		for (int i = 1; i <= 5; i++) {
			count = 0;
			int su1 = (int)(Math.random()*90+10);
			int su2 = (int)(Math.random()*90+10);
			while (true) {
				
				System.out.print("["+i+"]"+su1 + "+" + su2 + " = ");
				int user = Integer.parseInt(br.readLine());
				
				if (su1 + su2 != user && count == 0) {
					System.out.println("틀렸다");
					count++;
				} else if (su1 + su2 != user && count != 0) {
					System.out.println("틀렸다... 정답 : " + (su1 + su2));
					break;
				} else {
					System.out.println("딩동뎅");
					score = score+20;
					x++;
					break;
				}
			}
			System.out.println();
		}
		
		System.out.println("당신은 총"+x+"문제를 맞추어서 "+score+"점 입니다.");
		for(;;)
		{
			System.out.print("continue(y/n) : ");
			String sw = br.readLine();
			
			if(sw.equals("Y")||sw.equals("y")) {
				
				t_f = true;
				break;
			}else if(sw.equals("N")||sw.equals("n")) {
				t_f = false;
				break;
			}else {
				
			}
		}
		}while(t_f);
	}
}
