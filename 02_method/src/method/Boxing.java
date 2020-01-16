package method;

public class Boxing {
	public static void main(String[] args) {
		int a= 25;
		double b = (double)a/3; // cast연산 - 형변환
		
		int c=5;
		Integer d = c; //AutoBoxing 기본형 -> 객체형
		//Integer d = new Integer(c); JDK5.0 이전
		
		Integer e=5;
		int f = e; //unAutoBoxing 객체형 -> 기본형
		//int f = e.intValue(); JDK5.0 이전
		String s = "i";
		System.out.println(e.toString());
		System.out.println(s.toString());
		
		
	}
}
