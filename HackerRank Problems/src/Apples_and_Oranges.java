
public class Apples_and_Oranges {

	public static void main(String[] args) {
		count(7,11,5,15,new int[]{-2,2,1},new int[]{5,-6});
	}
	static void count(int s,int t,int a,int b,int[] apple,int[] orange) {
		int acount=0,ocount=0;
		for(int i=0;i<apple.length;i++) {
			if(a+apple[i]>=s&&a+apple[i]<=t) {
				acount++;
			}
		}
		for(int i=0;i<orange.length;i++) {
			if(b+orange[i]>=s&&b+orange[i]<=t) {
				ocount++;
			}
		}
		System.out.println(acount);
		System.out.println(ocount);
	}
}
