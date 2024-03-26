
public class painters_partition_problem_in_binary_search {

	public static void main(String[] args) {
		int[] a= {10,20,30,40};
		int p=2;
		int b=2;//amount Of Time to paint 1 unit of board.
		System.out.println(maxTime(a,p,b));
	}

	private static int maxTime(int[] a, int p, int b) {
		int l=0;
		int h=0;
		for(int i:a) {
			h=h+i;
		}
		int res=-1;
		while(l<=h) {
			int m=(l+h)/2;
			if(isPossibleSol(a,p,m)==true) {
				res=m;
				h=m-1;
			}
			else {
				l=m+1;
			}
		}
		return res*b;
	}

	private static boolean isPossibleSol(int[] a, int p, int m) {
		int painters=1;
		int pbc=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>m) {
				return false;
			}
			if(pbc+a[i]<=m) {
				pbc+=a[i];
			}else {
				painters++;
				if(painters>p) {
					return false;
				}
				pbc=a[i];
			}
		}
		return true;
	}

}
