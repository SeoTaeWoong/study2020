package instance;

public class Variable {
	public static void main(String[] args) {
	//�޸� �Ҵ�
		boolean a;
		a = true ; 
		System.out.println("a= "+a);
		
		char b;
		b = 'A';
		System.out.println("b= "+ b);
		
		char c;
		c= 65;
		//c = 65536 (error)
		System.out.println("c= "+ c);
		
		int d = 65;
		System.out.println("d= "+ d);
		
		int e = 'A';
		System.out.println("e= "+ e);
		
		int f = (int)25l; // 25l = long type
		System.out.println("f= "+ f);
		
		//float g = 43.8; // �ڹٴ� �Ǽ��� ������ double type���� ����
		float g = 43.8f; // or g = (float)43.8
		System.out.println("g= "+ g);
	}
}



