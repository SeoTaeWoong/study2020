package array;

public class ArrayTest {
	public static void main(String[] args) {
	
		int[] ar;
		ar = new int[5];
		ar[0] = 25;
		ar[1] = 36;
		ar[2] = 47;
		ar[3] = 55;
		ar[4] = 60;
		int[] av = new int[5];
		av[0] = 2;
		av[1] = 3;
		av[2] = 4;
		av[3] = 5;
		av[4] = 6;
		System.out.println(ar);
		System.out.println(av);
		System.out.println(ar[0]);
		System.out.println(av[0]);
		for(int i = 0; i<ar.length; i++) {
			System.out.println(ar[i]);
		}
		//String�� �����ּ� ���� �ٲ�� �����ּҵ� �ٲ��.
		//�迭�� �̸��� �ּҰ��� ����;
		//
		
		System.out.println();
		System.out.println("�Ųٷ� ���");
		for(int i = ar.length-1; i>=0; i--) {
			System.out.println(ar[i]);
		}
		System.out.println();
		System.out.println("Ȧ�������� ���");
		for(int i = 0 ; i<ar.length; i++) {
			if(ar[i] %2 !=0) {
				System.out.println(ar[i]);
			}
		}
		System.out.println();
		System.out.println("Ȯ�� for");
		for(int data1 : ar) {//ar�� ũ�⸸ŭ �ݺ��ϸ鼭 �����͸� �����ش�.
			System.out.println(data1);
		}
	}
}
