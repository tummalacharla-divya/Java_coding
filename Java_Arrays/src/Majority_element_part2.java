//boyer-moore majority voting algorithm
public class Majority_element_part2 {

	public static void main(String[] args) {
		int[] a= {2,2,1,1,1,2,2};
		int maj=a[0];
		int c=1;
		for(int i=0;i<a.length;i++) {
			if(a[i]==maj) {
				c++;
			}
			else {
				c--;
			}
			if(c==0) {
				maj=a[i];
				c=c+1;
			}
		}
		System.out.println(maj);
	}

}
