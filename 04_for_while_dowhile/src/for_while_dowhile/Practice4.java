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
					System.out.println("Ʋ�ȴ�");
					count++;
				} else if (su1 + su2 != user && count != 0) {
					System.out.println("Ʋ�ȴ�... ���� : " + (su1 + su2));
					break;
				} else {
					System.out.println("������");
					score = score+20;
					x++;
					break;
				}
			}
			System.out.println();
		}
		
		System.out.println("����� ��"+x+"������ ���߾ "+score+"�� �Դϴ�.");
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
