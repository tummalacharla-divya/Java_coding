
public class Solve_subarray_problems_quickly_with_sliding_window_technique {

	public static void main(String[] args) {
		int[] a= {2,9,31,-4,21,7};
		int k=3;
		int mSum=Integer.MIN_VALUE;
		int wSum=0;
		for(int i=0;i<k;i++) {
			wSum=wSum+a[i];
		}
		for(int i=k;i<a.length;i++) {
			wSum=wSum-a[i-k]+a[i];
			mSum=Math.max(wSum, mSum);
		}
		System.out.println(mSum);
	}

}
