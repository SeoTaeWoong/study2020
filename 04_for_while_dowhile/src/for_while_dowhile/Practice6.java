package for_while_dowhile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Practice6 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("중간고사를 입력하시오 : ");
		int su1 = Integer.parseInt(br.readLine());
		System.out.print("기말고사를 입력하시오 : ");
		int su2 = Integer.parseInt(br.readLine());
		System.out.print("과제점수를 입력하시오 : ");
		int su3 = Integer.parseInt(br.readLine());
		System.out.print("출석점수 입력하시오 : ");
		int su4 = Integer.parseInt(br.readLine());
		

		double grades = ((su1+su2)/2.0*0.6) + su3*0.2 + su4*0.2;
		char rank;
		String rating = null;
		switch((int)grades/10) {
		case 10:
		case 9:
			rank = 'A';
			rating = "excellent";
			break;
		case 8:
			rank = 'B';
			rating = "excellent";
			break;
		case 7:
			rank = 'C';
			rating = "good";
			break;
		case 6:
			rank = 'D';
			rating = "good";
			break;
		default :
			rank = 'F';
			rating = "poor";
			
		}
		
		System.out.println("성적 = "+String.format("%.2f", grades));
		System.out.println("학점 = "+rank);
		System.out.println("평가 = "+rating);
	}
}
