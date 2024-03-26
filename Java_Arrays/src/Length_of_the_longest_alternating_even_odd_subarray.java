
public class Length_of_the_longest_alternating_even_odd_subarray {

	public static void main(String[] args) {
		int[] a= {8,10,13,14};
		int c=1;
		int max=1;
		for(int i=1;i<a.length;i++) {
			if(a[i]%2==0 && a[i-1]%2!=0 || a[i]%2!=0 && a[i-1]%2==0 ) {
				c++;
			}
			else {
				c=1;
			}
			max=Math.max(max, c);
		}
		System.out.println(max);
//		int max=0;
//		for(int i=0;i<a.length;i++) {
//			int c=1;
//			for(int j=i+1;j<a.length;j++) {
//				if(a[j]%2==0 && a[j-1]%2!=0 || a[j]%2!=0 && a[j-1]%2==0 ) {
//					c++;
//				}
//				else {
//					break;
//				}
//			}
//			max=Math.max(max, c);
//		}
//		System.out.println(max);
	}

}
