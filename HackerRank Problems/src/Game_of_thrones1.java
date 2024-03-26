import java.util.Arrays;

public class Game_of_thrones1 {

	public static void main(String[] args) {
		String s="adamm";
		System.out.println(game(s));
	}
	static String game(String s) {
		char[] ar=s.toCharArray();
		Arrays.sort(ar);
		int i=0;
		int errorcount=0;
		while(i<ar.length) {
			if(i<ar.length-1&&ar[i]==ar[i+1]) {
				i+=2;
			}
			else {
				i++;
				errorcount++;
			}
		}
		if(errorcount<=1) {
			return "Yes";
		}
		else {
			return "No";
		}
	}
}
