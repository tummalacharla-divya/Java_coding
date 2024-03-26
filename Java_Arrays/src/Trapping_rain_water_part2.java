
public class Trapping_rain_water_part2 {

	public static void main(String[] args) {
		int[] a= {4,2,0,3,2,5};
		System.out.println(trapWater(a));
	}
	public static int trapWater(int[] a) {
		int res=0;
		int lhb=a[0];
		int rhb=a[a.length-1];
		int l=0,r=a.length-1;
		
		while(l<=r) {
			if(lhb<=rhb) {
				if(a[l]>=lhb) {
					lhb=a[l];
				}
				else {
					res=res+lhb-a[l];
				}
				l++;
			}
			else {
				if(a[r]>=rhb) {
					rhb=a[r];
				}
				else {
					res=res+rhb-a[r];
				}
				r--;
			}
		}
		return res;
	}
}
