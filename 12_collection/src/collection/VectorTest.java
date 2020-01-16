package collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		System.out.println("���� ũ�� = : "+v.size());//0
		System.out.println("���� �˷� = "+v.capacity());
		System.out.println();
		
		System.out.println("�׸��߰�");
		for(int i=1; i<=10; i++) {
			v.add(i+"");
		}
		System.out.println("���� ũ�� = : "+v.size());//10
		System.out.println("���� �˷� = "+v.capacity());//10
		
		v.addElement(5+"");
		System.out.println("���� ũ�� = : "+v.size());//10
		System.out.println("���� �˷� = "+v.capacity());//10
		
		for(int i=0; i<v.size(); i++) {
			System.out.print(v.get(i)+" ");
			
		}System.out.println();
		v.remove(10);
		Iterator<String> it = v.iterator();
		while(it.hasNext()) {
			System.out.print((it.next()+" "));
		}
		System.out.println();
		
		Vector<String> v2 = new Vector<String>(5,2);//�⺻�뷮5��, 2������

	}

}
