package abstract_01;

/*
 * class Object{
 * 		public boolean equals(Object ob) {}//������ ��
 * 		public String toString(){} //Ŭ����@16����
 * 		public int hashCode(){} //10����
 * }
 * 
 * class String extends Object{
 * 		public boolean equals(Object ob(OP
 * 		public String toString(){} //���ڿ�(���Ѵ�)
 * 		public int hashCode(){} //int 21��, �Ұ���
 */

class Test extends Object{
public String toString() {
	return getClass()+"���ٺ�";	
	}
}

public class ObjectMain {
	
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println("��üt = "+t);
		System.out.println("��üt = "+t.toString());
		System.out.println("��üt = "+t.hashCode());
		System.out.println();
		
		String str = "apple";
		System.out.println("��üstr = "+str);
		System.out.println("��üstr = "+str.toString());
		System.out.println("��üstr = "+str.hashCode());
		
		String aa = new String("apple");
		String bb = new String("apple");
		System.out.println("aa==bb : "+(aa==bb));//������  - F
		System.out.println("aa.equals(bb) : "+aa.equals(bb));//���ڿ� -T
		System.out.println();
		
		Object cc = new Object();
		Object dd = new Object();
		System.out.println("cc==dd : "+(cc==dd));//������ - F
		System.out.println("cc.equals(dd) :"+cc.equals(dd));
		System.out.println();
		
		Object ee = new String("apple");
		Object ff = new String("apple");
		System.out.println(ee=ff); //F
		System.out.println(ee.equals(ff)); //�������̵� ���ڿ� - T 
	}

}
