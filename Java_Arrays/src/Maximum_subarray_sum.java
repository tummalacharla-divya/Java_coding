/*
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has 
 * the largest sum and return its sum

A subarray is a contiguous part of an array

Example 1:

Inputs nums(-2,1,-3,4,-1,2,1,-5,4)

Output: 6

Explanation: [4,-1,2,1] has the largest sum 6.

Example 2:

Inputs nums (1)

Output: 1
 */
public class Maximum_subarray_sum {

	public static void main(String[] args) {
		int[] a= {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSum(a));
	}

	private static int maxSum(int[] a) {
		int sum=a[0];
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			if(sum>=0) {
				sum+=a[i];
			}
			else {
				sum=a[i];
			}
			if(sum>max) {
				max=sum;
			}
		}
		return max;
	}

}
