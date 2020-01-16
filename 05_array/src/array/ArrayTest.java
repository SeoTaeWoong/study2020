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
		//String은 참조주소 값이 바뀌면 참조주소도 바뀐다.
		//배열의 이름은 주소값이 들어간다;
		//
		
		System.out.println();
		System.out.println("거꾸로 출력");
		for(int i = ar.length-1; i>=0; i--) {
			System.out.println(ar[i]);
		}
		System.out.println();
		System.out.println("홀수데이터 출력");
		for(int i = 0 ; i<ar.length; i++) {
			if(ar[i] %2 !=0) {
				System.out.println(ar[i]);
			}
		}
		System.out.println();
		System.out.println("확장 for");
		for(int data1 : ar) {//ar의 크기만큼 반복하면서 데이터를 꺼내준다.
			System.out.println(data1);
		}
	}
}
