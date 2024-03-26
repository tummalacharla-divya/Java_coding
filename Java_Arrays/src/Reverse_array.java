
public class Reverse_array {

	public static void main(String[] args) {
		int[] ar= {2,5,3,7,3,5,7,3,8};
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
		reverse(ar);
		
		System.out.println();
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
	}

	private static void reverse(int[] ar) {
		int i=0,j=ar.length-1;
		while(i<j) {
			int temp=ar[i];
			ar[i]=ar[j];
			ar[j]=temp;
			i++;
			j--;
		}
	}

}
