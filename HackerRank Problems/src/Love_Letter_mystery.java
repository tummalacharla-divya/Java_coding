
public class Love_Letter_mystery {

	public static void main(String[] args) {
		String s="cde";
		System.out.println(loveLetter(s));
	}
	static int loveLetter(String s) {
		int i=0,j=s.length()-1;
		int c=0;
		int t=0;
		char c1=' ',c2=' ';
		while(i<j) {
			c1=s.charAt(i);
			c2=s.charAt(j);
			if(c1>c2) {
				t=c1-c2;
			}
			else {
				t=c2-c1;
			}
			c+=t;
			i++;
			j--;
		}
		return c;
	}
}
