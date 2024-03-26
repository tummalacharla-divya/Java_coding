
public class Repeated_String {

	public static void main(String[] args) {
		String s="abab";
		int n=10;
		System.out.println(repeat(n,s));
	}
	static int repeat(int n,String s) {
		int c=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a') {
				c++;
			}
		}
		c=c*(n/s.length());
		for(int i=0;i<(n%s.length());i++) {
			if(s.charAt(i)=='a') {
				c++;
			}
		}
		return c;
	}
}
