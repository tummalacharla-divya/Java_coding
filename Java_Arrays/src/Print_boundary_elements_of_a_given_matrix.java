
public class Print_boundary_elements_of_a_given_matrix {

	public static void main(String[] args) {
		int[][] ar= {{1,6,8,9,0},{5,7,8,3,8},{2,3,64,3,7},{2,4,7,3,6},{9,65,3,7,2}};
		int  i=0,j=0;
		for(j=0;j<ar.length;j++) {
			System.out.print(ar[i][j]+" ");
		}
		j=ar.length-1;
		for(i=1;i<ar.length;i++) {
			System.out.print(ar[i][j]+" ");
		}
		i=ar.length-1;
		for(j=ar.length-2;j>=0;j--) {
			System.out.print(ar[i][j]+" ");
		}
		j=0;
		for(i=ar.length-2;i>0;i--) {
			System.out.print(ar[i][j]+" ");
		}
	}

}
