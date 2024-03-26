/*
 * Given an array of integers nues sorted in ascending order, find the starting and ending position of a given

target value

If target is not found in the array, return [-1,-1]

You must write an algorithm with O(log n) runtime complexity

Example 1:

Inputs nums [5,7,7,0,0,10), target 0

Output: [3,4]

Example 2:

Inputs nums (5,7,7,8,8,10), target 6

Output: [-1,-1]
 */
import java.util.Arrays;

public class First_last_position_of_an_element_in_a_sorted_array {

	public static void main(String[] args) {
		int[] ar= {3,4,4,4,4,4,4,4,4,6};
		System.out.println(Arrays.toString(firstLast(ar,4)));
	}

	private static int[] firstLast(int[] ar,int target) {
		int l=0,h=ar.length-1,m=0;
		int[] res= {-1,-1};
		while(l<=h) {
			m=(l+h)/2;
			if(target==ar[m]) {
				res[0]=m;
				h=m-1;
			}
			else if(ar[m]<target) {
				l=m+1;
			}
			else {
				h=m-1;
			}
		}
		
		l=0;h=ar.length-1;m=0;
		while(l<=h) {
			m=(l+h)/2;
			if(target==ar[m]) {
				res[1]=m;
				l=m+1;
			}
			else if(ar[m]<target) {
				l=m+1;
			}
			else {
				h=m-1;
			}
		}
		return res;
	}

}
