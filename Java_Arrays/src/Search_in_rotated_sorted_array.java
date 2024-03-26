/*
 * There is an integer array nuns sorted in ascending order (with distinct values).

Prior to being passed to your function, nuns is possibly rotated at an unknown pivot index k 
(1<=k< nums.length) such that the resulting array is [nums[k], nums[k+1].....nums[n-1], nums[0], nuns[1], nuns[k-1]] 
(0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2)

Given the array nuns after the possible rotation and an integer target, return the index of target if 
it is in nums, or -1 if it is not in nums

You must write an algorithm with O(logn) runtime complexity

Example 1:

Input: nums (4,5,6,7,0,1,2), target=0

Output: 4
 */
public class Search_in_rotated_sorted_array {

	public static void main(String[] args) {
		int[] a= {4,5,6,7,0,1,2};
		System.out.println(search(a,0));
	}

	private static int search(int[] a, int target) {
		int l=0,h=a.length-1,m=0;
		while(l<=h) {
			m=(l+h)/2;
			if(target==a[m]) {
				return m;
			}
			else if(a[l]<=a[m]) {
				if(target>=a[l] && target<a[m]) {
					h=m-1;
				}
				else {
					l=m+1;
				}
			}
			else {
				if(target>a[m] && target<=a[h]) {
					l=m+1;
				}
				else {
					h=m-1;
				}
			}
		}
		return -1;
	}

}
