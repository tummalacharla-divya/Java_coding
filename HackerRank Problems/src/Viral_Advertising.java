
public class Viral_Advertising {

	public static void main(String[] args) {
		int n=4; //no.of days
		int shared=5;
		int like=0;
		int total=0;
		while(n>0) {
			like=shared/2;
			shared=like*3;
			total+=like;
			n-=1;
		}
		System.out.println(total);
	}

}
