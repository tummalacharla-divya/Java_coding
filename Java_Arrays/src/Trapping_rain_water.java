//leetcode #42
//O(n*n)
public class Trapping_rain_water {

	public static void main(String[] args) {
		int[] h= {4,2,0,3,2,5};
		System.out.println(trap(h));
	}
	static int trap(int[] a) {
		int res=0;
		for(int i=1;i<=a.length-2;i++) {
			int lb=a[i];
			for(int j=0;j<i;j++) {
				if(a[j]>lb) {
					lb=a[j];
				}
			}
			int rb=a[i];
			for(int j=i+1;j<a.length;j++) {
				if(a[j]>rb) {
					rb=a[j];
				}
			}
			int wl;
			if(rb>lb) {
				wl=lb;
			}
			else {
				wl=rb;
			}
			int tw=wl-a[i];
			res=res+tw;
		}
		return res;
	}
}
