package array;

public class MultiArray3 {
	public static void main(String[] args) {
		
		int[][] ar = {{1,2,3,0},{4,5,6,0},{7,8,9,0},{0,0,0,0}}; 
		int sum;
		for(int i = 0; i < ar.length-1; i++) {
			for(int j =0; j<ar[i].length-1; j++) {
				ar[i][3] += ar[i][j];
				//ar[3][i] += ar[j][i];
				ar[3][j] +=ar[i][j]; 
			}
			
			//System.out.print(ar[i][3]+" ");
			System.out.println();
			System.out.print(ar[3][0]+" ");
			System.out.print(ar[3][1]+" ");
			System.out.print(ar[3][2]+" ");
		}
		
	}
	
}
