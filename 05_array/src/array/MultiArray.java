package array;

public class MultiArray {
	
	public static void main(String[] args) {
		int[][] ar = new int[3][2];
		ar[0][0] = 10;
		ar[0][1] = 20;
		ar[1][0] = 30;
		ar[1][1] = 40;
		ar[2][0] = 50;
		ar[2][1] = 60;
		
		System.out.println(ar);
		System.out.println(ar[0].hashCode());
		System.out.println(ar[1].hashCode());
		System.out.println(ar[2].hashCode());
		int k = 20;
		
		for(int i =0; i<ar.length; i++) {
			for(int j = 0; j<ar[i].length; j++) {
				ar[i][j] = k;
				k= k+10;
				System.out.print("ar["+i+ "]["+j+"] = "+ ar[i][j]+"  ");
			}
			System.out.println();
		}
			
		
		
	}
}
