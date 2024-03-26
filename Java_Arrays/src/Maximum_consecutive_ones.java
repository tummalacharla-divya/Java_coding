
public class Maximum_consecutive_ones {

	public static void main(String[] args) {
		int[] a= {0,1,1,0,0,1,1,1,0};
		int c=0;
		int max=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				c++;
				max=Math.max(c, max);
			}
			else
				c=0;
		}
		System.out.println(max);
	}

}
