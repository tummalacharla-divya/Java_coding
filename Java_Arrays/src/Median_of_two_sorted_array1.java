//O(m+n)
//best approach is O(log(m+n))
//so go to second approach(  Median_of_two_sorted_array  )
public class Median_of_two_sorted_array1 {

	public static void main(String[] args) {
		int[] a1= {1,3,8,17};
		int[] a2= {5,6,7,19,21,25};
		System.out.println(median(a1,a2));
	}

	private static float median(int[] a1, int[] a2) {
		int i=0,j=0,k=0;
		int[] m=new int[a1.length+a2.length];
		while(j<a2.length) {
			if(i<a1.length && a1[i]<a2[j]) {
				m[k]=a1[i];
				k++;
				i++;
			}
			else {
				m[k]=a2[j];
				k++;
				j++;
			}
		}
//		for(int l:m) {
//			System.out.print(l+" ");
//		}
		int mid=m.length/2;
		if(m.length%2==0) {
			return (float)(m[mid]+m[mid-1])/2;
		}
		else {
			return m[mid];
		}
	}

}
