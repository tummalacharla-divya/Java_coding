//leetcode #48
public class Rotate_image_by_90_degrees_clockwise {

	public static void main(String[] args) {
		int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
		printArray(a);
		System.out.println();
		rotate(a);
		printArray(a);
	}
	public static void printArray(int[][] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

	private static int[][] rotate(int[][] ar) {
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				int temp=ar[i][j];
				ar[i][j]=ar[j][i];
				ar[j][i]=temp;
			}
		}
		for(int i=0;i<ar.length;i++) {
			int left=0;
			int right=ar[0].length-1;
			while(left<right) {
				int temp=ar[i][left];
				ar[i][left]=ar[i][right];
				ar[i][right]=temp;
				left++;
				right--;
			}
		}
		return ar;
	}
}
