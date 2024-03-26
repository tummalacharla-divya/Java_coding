
public class Count_Smaller_or_equal_elements_in_array {

	public static void main(String[] args) {
		int[] a= {2,6,12,18,21,26,26,26};
		System.out.println(count(a,26));
		int[] as= {2,6,12,18,21,26,78,99};
		System.out.println(count(as,26));
		int[] ae= {2,6,12,18,21,26,78,99};
		System.out.println(count(ae,25));

	}

	private static int count(int[] a,int ele) {
		int l=0,h=a.length,m=0;
		while(l<=h) {
			m=(l+h)/2;
			if(a[m]==ele) {
				while(m+1<a.length && ele==a[m+1]) {
					m++;
				}
				break;
			}
			else if(ele<a[m]) {
				h=m-1;
			}
			else {
				l=m+1;
			}
			
		}
		if(a[m]>ele) {
			return m;
		}
		else {
			return m+1;
		}
	}

}
