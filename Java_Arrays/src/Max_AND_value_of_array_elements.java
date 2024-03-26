
public class Max_AND_value_of_array_elements {

	public static void main(String[] args) {
		int[] ar= {16,9,6,13};
		System.out.println(maxAndValue(ar));
		System.out.println(MaxAnd(ar));
	}
	public static int checkbits(int[] ar,int mask) {
		int count=0;
		for(int i=0;i<ar.length;i++) {
			if((mask&ar[i])==mask) {
				count++;
			}
		}
		return count;
	}
	public static int maxAndValue(int[] ar) {
		int mask=0,res=0;
		for(int i=31;i>=0;i--) {
			mask=(1<<i)|res;
			int count=checkbits(ar,mask);
			if(count>=2) {
				res=res|mask;
			}
		}
		return res;
	}
	public static int MaxAnd(int[] ar) {
		int res=0;
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if((ar[i]&ar[j])>res) {
					res=(ar[i]&ar[j]);
				}
			}
		}
		return res;
	}
}
