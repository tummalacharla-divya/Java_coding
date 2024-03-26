
public class Sherlock_and_Array {

	public static void main(String[] args) {
		int[] a= {5,6,8,11};
		System.out.println(sherlock(a));
	}
	static String sherlock(int[] a) {
		int t=0;
		int leftsum=0,rightsum=0;
		for(int i=0;i<a.length;i++) {
			t=t+a[i];
		}
		for(int i=0;i<a.length;i++) {
			rightsum=t-a[i]-leftsum;
			if(leftsum==rightsum) {
				return "Yes";
			}
			else {
				leftsum+=a[i];
			}
		}
		return "No";
	}

}
