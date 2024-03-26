
public class Find_Digit {

	public static void main(String[] args) {
		int n=1240;
		System.out.println(findDigit(n));
	}
	static int findDigit(int n) {
		int c=0;
		int t=n;
		while(n>0) {
			int m=n%10;
			if(m!=0) {
				if(t%m==0) {
					c++;
				}
			}
			n=n/10;
		}
		return c;
	}
}
