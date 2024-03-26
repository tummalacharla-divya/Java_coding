import java.util.ArrayList;

public class Subarray_division {

	public static void main(String[] args) {
		ArrayList<Integer> s=new ArrayList<Integer>();
		s.add(2);
		s.add(2);
		s.add(1);
		s.add(3);
		s.add(2);
		System.out.println(birthday(s,4,2));
	}

	private static int birthday(ArrayList<Integer> s, int d, int m) {
		int c=0;
		for(int i=0;i<=s.size()-m;i++) {
			int sum=0;
			for(int j=i;j<i+m;j++) {
				sum=sum+s.get(j);
			}
			if(sum==d) {
				c++;
			}
		}
		return c;
	}
	
}
