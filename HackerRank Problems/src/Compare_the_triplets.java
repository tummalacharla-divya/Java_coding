import java.util.ArrayList;

public class Compare_the_triplets {

	public static void main(String[] args) {
		int[] a= {1,2,3};
		int[] b= {3,2,1};
		ArrayList<Integer> al=new ArrayList<Integer>();
		int alice=0,bob=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>b[i]) {
				alice++;
			}
			else if(a[i]<b[i]) {
				bob++;
			}
		}
		al.add(alice);
		al.add(bob);
		System.out.println(al);
	}

}
