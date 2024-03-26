// a bitonic sequence is a sequence of numbers which is first strictly increasing then after a point 
//strictly decreasing

public class Search_element_in_bitonic_array {

	public static void main(String[] args) {
		int[] a= {5,6,7,8,9,10,3,2,1};
		int b=8;
		int bInd=bitonic(a);
		System.out.println(searchBitonic(a,b,bInd));
	}
	static int searchBitonic(int[] a, int key, int bInd) {
		if(key==a[bInd]) {
			return bInd;
		}
		if(key>a[bInd]) {
			return -1;
		}
		int res1=ascBinary(a,key,bInd-1);
		if(res1!=-1) {
			return res1;
		}
		int res2=descBinary(a,key,bInd+1);
		if(res2!=-1) {
			return res2;
		}
		return -1;
	}
	private static int bitonic(int[] a) {
		int l=0,r=a.length-1,m=0;
		while(l<=r) {
			m=(l+r)/2;
			if(a[m]>a[m-1] && a[m]>a[m+1]) {
				return m;
			}
			else if(a[m]>a[m-1] && a[m]<a[m+1]) {
				l=m;
			}
			else {
				r=m;
			}
		}
		return -1;
	}
	public static int ascBinary(int[] a, int key,int range) {
		int l=0,h=range,m=0;
		while(l<=h) {
			m=(l+h)/2;
			if(key==a[m]) {
				return m;
			}
			else if(key<a[m]) {
				h=m-1;
			}
			else {
				l=m+1;
			}
		}
		return -1;
	}
	public static int descBinary(int[] a, int key,int range) {
		int l=range,h=a.length-1,m=0;
		while(l<=h) {
			m=(l+h)/2;
			if(key==a[m]) {
				return m;
			}
			else if(key<a[m]) {
				l=m+1;
			}
			else {
				h=m-1;
			}
		}
		return -1;
	}

}
