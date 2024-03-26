import java.awt.List;
import java.util.ArrayList;

public class Breaking_the_records {

	public static void main(String[] args) {
		int[] a= {10,5,20,20,4,5,2,25,1};
		int maxcount=0,mincount=0;
		int max=a[0];
		int min=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
				maxcount++;
			}
			else if(a[i]<min) {
				min=a[i];
				mincount++;
			}
		}
		System.out.println(maxcount);
		System.out.println(mincount);
	}
	
	
	static ArrayList<Integer> breakhg(ArrayList<Integer> s) {
		ArrayList<Integer> res=new ArrayList<Integer>();
		int maxcount=0,mincount=0;
		int max=s.get(0);
		int min=s.get(0);
		for(int i=1;i<s.size();i++) {
			if(s.get(i)>max) {
				max=s.get(i);
				maxcount++;
			}
			else if(s.get(i)<min) {
				min=s.get(i);
				mincount++;
			}
		}
		res.add(maxcount);
		res.add(mincount);
		return res;
	}
}
