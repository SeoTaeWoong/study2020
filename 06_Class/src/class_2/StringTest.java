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
		
		String e = "���� ��¥�� "+ 
		2019+12+30;
		System.out.println(e);
		//class@16����
		
		System.out.println("���ڿ��� ũ��"+e.length());
		
		System.out.println(e.substring(7));
		System.out.println(e.substring(7,11));
		
		System.out.println(e.toUpperCase());
		System.out.println(e.toLowerCase());
		
		System.out.println(e.indexOf("¥"));
		System.out.println(e.indexOf("��¥"));
		System.out.println(e.indexOf("���ٺ�"));
	}
}
