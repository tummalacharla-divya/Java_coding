
public class Remove_duplicates_from_sorted_array {

	public static void main(String[] args) {
		int[] ar= {2,2,3,3,4,6,6};
		for(int i:ar) {
			System.out.print(i+" ");
		}
		int rd=removeDuplicate(ar);
		System.out.println();
		for(int i=0;i<rd;i++) {
			System.out.print(ar[i]+" ");
		}
	}

	private static int removeDuplicate(int[] ar) {
		int rd=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[rd]!=ar[i]) {
				rd++;
				ar[rd]=ar[i];
			}
		}
		return rd+1;
	}

}
