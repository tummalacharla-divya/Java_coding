
public class Alternating_characters {

	public static void main(String[] args) {
		String s="AABAAB";
		int c=0;
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)==s.charAt(i+1)) {
				c++;
			}
		}
		System.out.println("delete duplicates at "+c+" positions");
	}

}
