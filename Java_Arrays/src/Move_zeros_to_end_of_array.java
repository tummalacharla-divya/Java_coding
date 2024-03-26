
public class Move_zeros_to_end_of_array {

	public static void main(String[] args) {
		int[] ar= {2,0,4,5,0,3,0};
		for(int i:ar) {
			System.out.print(i+" ");
		}
		moveZeros(ar);
		System.out.println();
		for(int i:ar) {
			System.out.print(i+" ");
		}
	}

	private static void moveZeros(int[] ar) {
		int s=ar.length;
		if(s==0||s==1) {
			return;
		}
		int nz=0,n=0;
		while(nz<s) {
			if(ar[nz]!=0) {
				int temp=ar[n];
				ar[n]=ar[nz];
				ar[nz]=temp;
				nz++;
				n++;
			}
			else {
				nz++;
			}
		}
	}

}
