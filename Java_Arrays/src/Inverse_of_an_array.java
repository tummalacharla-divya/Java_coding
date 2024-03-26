
public class Inverse_of_an_array {

	public static void main(String[] args) {
		int[] a= {2,3,1,0,4};
		for(int i:a) {
			System.out.print(i+" ");
		}
		System.out.println();
		int[] b=inverse(a);
		for(int i:b) {
			System.out.print(i+" ");
		}
	}
	public static int[] inverse(int[] a) {
		int[] b=new int[a.length];
		for(int i=0;i<a.length;i++) {
			int v=a[i];
			b[v]=i;
		}
		return b;
	}

}
