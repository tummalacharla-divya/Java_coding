
public class Min_consecutive_flips {

	public static void main(String[] args) {
		int[] a= {1,1,0,0,1,1,0,0,0,1,1};
		//int[] a= {1,1,0,0,1,1,0,0,0};
		for(int i=1;i<a.length;i++) {
			if(a[i]!=a[i-1]) {
				if(a[i]!=a[0]) {
					System.out.print(i+"-");
				}
				else {
					System.out.println(i-1);
				}
			}
		}
		if(a[0]!=a[a.length-1]) {
			System.out.println(a.length-1);
		}
	}

}
