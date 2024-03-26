
public class Rotate_array {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		for (int i : a) {
			System.out.print(i+" ");
		}
		System.out.println();
		rotate(a,7);   //O(3n) ===>O(n)
		for (int i : a) {
			System.out.print(i+" ");
		}
	}
	static void reverse(int[] a,int start,int end) {
		while(start<end) {                 // time complexity O(n)
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
		}
	}
	static void rotate(int[] a,int k) {
		k=k%a.length;
		if(k<0) {
			k=k+a.length;
		}
		reverse(a,0,k-1);      //O(n)
		reverse(a,k,a.length-1);//O(n)
		reverse(a,0,a.length-1);//O(n)
//		for(int i=1;i<=k;i++) {
//			rotateOne(a);    //O(kn)
//		}
	}
	
	// it gets more time complexity
	private static void rotateOne(int[] a) {
		int temp=a[0];
		for(int i=1;i<a.length;i++) { //O(n)
			a[i-1]=a[i];
		}
		a[a.length-1]=temp;
	}
}
