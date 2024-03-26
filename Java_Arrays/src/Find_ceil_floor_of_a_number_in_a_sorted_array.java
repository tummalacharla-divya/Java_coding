//19,23,56,61,72,88,92  search for 68
//          h  l
public class Find_ceil_floor_of_a_number_in_a_sorted_array {

	public static void main(String[] args) {
		int[] ar= {19,23,56,61,72,88,92};
		System.out.println(ceil(ar,68));
		System.out.println(floor(ar,68));
	}

	private static int floor(int[] ar,int i) {
		int l=0,h=ar.length-1;
		while(l<=h) {
			int m=(l+h)/2;
			if(i==ar[m]) {
				return ar[m];
			}
			else if(i<ar[m]) {
				h=m-1;
			}
			else {
				l=m+1;
			}
		}
		if(h>=0) {
			return ar[h];
		}
		else {
			return -1;
		}
	}

	private static int ceil(int[] ar,int i) {
		int l=0,h=ar.length-1;
		while(l<=h) {
			int m=(l+h)/2;
			if(i==ar[m]) {
				return ar[m];
			}
			else if(i<ar[m]) {
				h=m-1;
			}
			else {
				l=m+1;
			}
		}
		if(l<ar.length) {
			return ar[l];
		}
		else {
			return -1;
		}
	}

}
