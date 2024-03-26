
public class Find_Median_of_row_wise_sorted_matrix {

	public static void main(String[] args) {
		int[][] m= {{5,11,20,35,45},{1,2,3,4,6},{13,15,16,19,21}};
		//System.out.println(binarySearch(m[0],15));
		int median=findMedian(m);
		System.out.println(median);
	}
	public static int binarySearch(int[] a,int k) {
		int high=a.length-1;
		int low=0;
		int mid=0;
		while(low<=high) {
			mid=(low+high)/2;
			if(a[mid]==k) {
				return mid;
			}
			else if (a[mid]<k) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		return -low;
	}
	public static int findMedian(int[][] m) {
		int min=m[0][0];
		int max=m[0][0];
		int medianpos= (m.length*m[0].length+1)/2;
		for(int i=0;i<m.length;i++) {
			if(m[i][0]<min) {
				min=m[i][0];
			}
			if(m[i][m[0].length-1]>max) {
				max=m[i][m[0].length-1];
			}
		}
		while(min<max) {
			int mid=(min+max)/2;
			int count=0;
			for(int i=0;i<m.length;i++) {
				int x=binarySearch(m[i],mid);
				if(x>=0) {
					while(m[i][x]==mid) {
						x++;
					}
				}
				else {
					x=x*-1;
				}
				count=count+x;
			}
			if(count<medianpos) {
				min=mid+1;
			}
			else {
				max=mid;
			}
		}
		return min;
	}

}
