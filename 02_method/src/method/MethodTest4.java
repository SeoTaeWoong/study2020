package method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodTest4 {

/*
 * �̸��� �ֹε�Ϲ�ȣ�� �Է��Ͽ� ������ ����Ͻÿ�.
 * ������ ������ ���� comp() �޼ҵ�� ���̸� ������Ҷ��� calcAge() �޼ҵ带 �ۼ��Ͻÿ�
 * 
 * �̸� �Է� : ȫ�浿
 * �ֹι�ȣ �Է� : 001023-3
 * 
 * ȫ�浿���� �����̰� 20�� �Դϴ�.
 */
	
	public String comp(String id) {
		
		return id.charAt(7)=='1' || id.charAt(7)=='3' ? "����":"����" ;
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
		
		System.out.print("�̸� �Է� : ");
		name = br.readLine();
		System.out.print("�ֹι�ȣ �Է� : ");
		id = br.readLine();
		MethodTest4 mt = new MethodTest4();
		
		gender = mt.comp(id);
		age = mt.calcAge(id);
		System.out.println(name+"���� "+gender+"�̰�"+age+"�� �Դϴ�.");
	}
}
