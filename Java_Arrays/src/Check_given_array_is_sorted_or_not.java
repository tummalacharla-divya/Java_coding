
public class Check_given_array_is_sorted_or_not {

	public static void main(String[] args) {
		int[] ar= {2,3,5,7,8,9,90};
		System.out.println(isSorted(ar));
	}

	private static boolean isSorted(int[] ar) {
		for(int i=1;i<ar.length;i++){
			if(ar[i]<ar[i-1]) {
				return false;
			}
		}
		return true;
	}

}
