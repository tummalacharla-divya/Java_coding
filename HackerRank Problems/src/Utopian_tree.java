
public class Utopian_tree {

	public static void main(String[] args) {
		int n=4;
		System.out.println(Tree(n));
	}
	static int Tree(int n) {
		int t=1;
		for(int i=1;i<=n;i++) {
			if(i%2!=0) {
				t=t*2;
			}else {
				t+=1;
			}
		}
		return t;
	}
}
