//a set of books contains the pages as {12,34,67,90}
//if we allocate these books to two students such as
//12 34 67 = 113           90 = 90
//12 34 = 46            67 90 = 157
//12 = 12            34 67 90 = 191
//bigger no. are 191,157,113 then select smallest number from biggest numbers

//time complexity : n+ log( sum(a))+n = O(n log (sum(a)))
public class Books_Allocation_problem_using_binary_search {

	public static void main(String[] args) {
		int[] a= {12,34,67,90};
		int no_of_students=2;
		System.out.println(maxPage(a,no_of_students));
	}
	private static int maxPage(int[] a, int n) {
		if(n>a.length) {
			return -1;
		}
		int l=a[0];
		int h=0;
		for(int i:a) {
			if(i<l) {
				l=i;
			}
			h=h+i;
		}
		int res=-1;
		while(l<=h) {
			int m=(l+h)/2;
			if(isPossibleSol(a,n,m)==true) {
				res=m;
				h=m-1;
			}
			else {
				l=m+1;
			}
		}
		return res;
	}
	
	private static boolean isPossibleSol(int[] a, int n, int m) {
		int students=1;
		int spc=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>m) {
				return false;
			}
			if(spc+a[i]<=m) {
				spc+=a[i];
			}else {
				students++;
				if(students>n) {
					return false;
				}
				spc=a[i];
			}
		}
		return true;
	}
}
