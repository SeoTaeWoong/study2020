package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionTest2 {
	private int dan;
	
	public void input() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("원하는 단을 입력하세요 : ");
		dan = Integer.parseInt(br.readLine());
		

	}
	
	public void output() {
		if(dan>1 && dan<10) {
			for(int i = 1; i<10; i++) {
				System.out.println(dan+"*"+i+"="+dan*i);
			}
		}else {
			//System.out.println("범위 초과 2~9만 가능합니다.");

			//강제로 Exception 발생
			try {
				//throw new Exception("범위 초과 2~9만 가능합니다.");
				throw new MakeException("범위 초과 2~9만 가능합니다.");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

		
	
	public static void main(String[] args) throws IOException {
		ExceptionTest2 et =new ExceptionTest2();
			et.input();
			et.output();
	}

}
