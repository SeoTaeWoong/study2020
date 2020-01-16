package mytestpack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestViewer {
	Question question = new Question();
	
	public static void main(String[] args) throws IOException {
		System.out.println("주민번호 입력 (-제외): ");
		String id = "9611091";
		System.out.println(id.charAt(6)==1 || id.charAt(6)==3 ? "남자":"여자" );
	}
}
