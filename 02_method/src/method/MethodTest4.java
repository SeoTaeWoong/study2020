package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodTest4 {

/*
 * 이름과 주민등록번호를 입력하여 성별을 출력하시오.
 * 성별을 구별할 때는 comp() 메소드와 나이를 계산하할때는 calcAge() 메소드를 작성하시오
 * 
 * 이름 입력 : 홍길동
 * 주민번호 입력 : 001023-3
 * 
 * 홍길동님은 남자이고 20살 입니다.
 */
	
	public String comp(String id) {
		
		return id.charAt(7)=='1' || id.charAt(7)=='3' ? "남자":"여자" ;
	}
	
	public int calcAge(String id) {
		
		String birth_year = id.charAt(0)+""+id.charAt(1);
		
		int birth_year1 = Integer.parseInt(birth_year);
			
		
		return birth_year1>=20 && birth_year1 < 100? (100-birth_year1+20) : 20-birth_year1;
	}
	public static void main(String[] args) throws IOException  {
		String name;
		String id;
		String gender;
		int age;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("이름 입력 : ");
		name = br.readLine();
		System.out.print("주민번호 입력 : ");
		id = br.readLine();
		MethodTest4 mt = new MethodTest4();
		
		gender = mt.comp(id);
		age = mt.calcAge(id);
		System.out.println(name+"님은 "+gender+"이고"+age+"살 입니다.");
	}
}
