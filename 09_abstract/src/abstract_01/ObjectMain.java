package abstract_01;

/*
 * class Object{
 * 		public boolean equals(Object ob) {}//참조값 비교
 * 		public String toString(){} //클래스@16진수
 * 		public int hashCode(){} //10진수
 * }
 * 
 * class String extends Object{
 * 		public boolean equals(Object ob(OP
 * 		public String toString(){} //문자열(무한대)
 * 		public int hashCode(){} //int 21억, 불가능
 */

class Test extends Object{
public String toString() {
	return getClass()+"개바부";	
	}
}

public class ObjectMain {
	
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println("객체t = "+t);
		System.out.println("객체t = "+t.toString());
		System.out.println("객체t = "+t.hashCode());
		System.out.println();
		
		String str = "apple";
		System.out.println("객체str = "+str);
		System.out.println("객체str = "+str.toString());
		System.out.println("객체str = "+str.hashCode());
		
		String aa = new String("apple");
		String bb = new String("apple");
		System.out.println("aa==bb : "+(aa==bb));//참조값  - F
		System.out.println("aa.equals(bb) : "+aa.equals(bb));//문자열 -T
		System.out.println();
		
		Object cc = new Object();
		Object dd = new Object();
		System.out.println("cc==dd : "+(cc==dd));//참조값 - F
		System.out.println("cc.equals(dd) :"+cc.equals(dd));
		System.out.println();
		
		Object ee = new String("apple");
		Object ff = new String("apple");
		System.out.println(ee=ff); //F
		System.out.println(ee.equals(ff)); //오버라이딩 문자열 - T 
	}

}
