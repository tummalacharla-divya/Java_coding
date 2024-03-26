
public class Span_of_array {

	public static void main(String[] args) {
		int[] ar= {20,42,88,10,99,6};
		System.out.println(span(ar));
	}

	private static int span(int[] ar) {
		int max=ar[0];
		int min=ar[0];
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>max) {
				max=ar[i];
			}
			else if(ar[i]<min) {
				min=ar[i];
			}
		}
		return max-min;
	}

}
