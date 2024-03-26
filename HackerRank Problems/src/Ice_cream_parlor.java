import java.util.ArrayList;

public class Ice_cream_parlor {

	public static void main(String[] args) {
		int m=6;
		int[] cost= {1,3,5,6};
		System.out.println(iceCreamParlor(m,cost));
	}
	private static ArrayList<Integer> iceCreamParlor(int m, int[] ar) {
		ArrayList<Integer> res=new ArrayList<Integer>();
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]+ar[j]==m) {
					res.add(i+1);
					res.add(j+1);
					break;
				}
			}
		}
		return res;
	}
	
//	static ArrayList<Integer> iceCreamParlor(int m,ArrayList<Integer> ar) {
//		ArrayList<Integer> res=new ArrayList<Integer>();
//		for(int i=0;i<ar.size();i++) {
//			for(int j=i+1;j<ar.size();j++) {
//				if(ar.get(i)+ar.get(j)==m) {
//					res.add(i+1);
//					res.add(j+1);
//					break;
//				}
//			}
//		}
//		return res;
//		
//	}
}
