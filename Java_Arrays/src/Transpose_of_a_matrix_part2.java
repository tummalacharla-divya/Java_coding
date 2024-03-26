
public class Transpose_of_a_matrix_part2 {

	public static void main(String[] args) {
		int[][] ar= {{1,6,8,9,0},{5,7,8,3,8},{2,3,64,3,7},{2,4,7,3,6},{9,65,3,7,2}};
		printArray(ar);
		
		int[][] b=transpose(ar);
		System.out.println();
		printArray(b);
	}
	
	private static int[][] transpose(int[][] ar) {
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				int temp=ar[i][j];
				ar[i][j]=ar[j][i];
				ar[j][i]=temp;
			}
		}
		return ar;
	}

	public static void printArray(int[][] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}


}
