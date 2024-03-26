//leetcode #240
public class Search_a_2D_matrix_II {

	public static void main(String[] args) {
		int[][] ar= {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
		System.out.println(isPresent(ar,12));
	}
	public static boolean isPresent(int[][] a,int ele) {
		int i=0,j=a[0].length-1;
		while(i<a.length&&j>=0) {
			if(a[i][j]==ele) {
				return true;
			}
			else if(ele<a[i][j]) {
				j--;
			}
			else {
				i++;
			}
		}
		return false;
		
	}
}
