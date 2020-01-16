package class_2;

public class StringTest {
	public static void main(String[] args) {
		String a = "apple";
		String b = "apple";
		String c = new String("apple");
		String d = new String("apple");
		int a1[] = {0};
		System.out.println(a==b);
		System.out.println(c==d);
		System.out.println(a1);
		
		String e = "오늘 날짜는 "+ 
		2019+12+30;
		System.out.println(e);
		//class@16진수
		
		System.out.println("문자열의 크기"+e.length());
		
		System.out.println(e.substring(7));
		System.out.println(e.substring(7,11));
		
		System.out.println(e.toUpperCase());
		System.out.println(e.toLowerCase());
		
		System.out.println(e.indexOf("짜"));
		System.out.println(e.indexOf("날짜"));
		System.out.println(e.indexOf("개바부"));
	}
}
