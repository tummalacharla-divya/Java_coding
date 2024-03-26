
public class Frequency_of_elements_in_a_sorted_array {

	public static void main(String[] args) {
		int[] a= {20,20,30,30,30,40};
		freq(a);
	}
	public static void freq(int[] a) {
		int freq=1;
		int i=1;
		while(i<a.length) {
			while(i<a.length&&a[i]==a[i-1]) {
				freq++;
				i++;
			}
			System.out.println(a[i-1]+" "+freq);
			freq=1;
			i++;
		}
		if(a.length==1 || a[i-1]!=a[i-2]) {
			System.out.println(a[i-1]+" "+freq);
		}
	}

}
