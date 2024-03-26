//Given an integer array bloomDay, an integer and an integer k.
//
//We need to make bouquets. To make a bouquet, you need to use k adjacent flowers from the garden.
//
//The garden consists of n flowers, the ith flower will bloom in the bloomDay[1] and then can be used in 
//exactly one bouquet.
//
//Return the minimum number of days you need to wait to be able to make bouquets from the garden. If it 
//is impossible to make bouquets return -1.
//
//Example 1:
//
//Input: bloomDay [1,10,3,10,2], 3, k=1
//output=3
public class Min_no_of_days_to_make_m_bouquets {

	public static void main(String[] args) {
		int[] a= {1,10,3,10,2};
		int boq=3;
		int flowers=1;
		System.out.println(minDayBouq(a,boq,flowers));
	}
	static boolean isPossible(int[] a,int boq,int flowers, int m) {
		int adj=0,bc=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]<=m) {
				adj++;
				if(adj==flowers) {
					bc++;
					if(boq==bc) {
						return true;
					}
					adj=0;
				}
			}
			else {
				adj=0;
			}
		}
		return false;
	}
	private static int minDayBouq(int[] a, int boq, int flowers) {
		if(boq*flowers>a.length) {
			return -1;
		}
		int l=a[0],h=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<l) {
				l=a[i];
			}
			if(a[i]>h) {
				h=a[i];
			}
		}
		int res=0;
		while(l<=h) {
			
			int m=(l+h)/2;
			if(isPossible(a,boq,flowers,m)==true) {
				res=m;
				h=m-1;
			}
			else {
				l=m+1;
			}
		}
		return res;
	}

}
