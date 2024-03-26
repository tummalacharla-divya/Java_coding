// an element is said to be a leader if all the elements to its right are less than the element . 
//and right most element is always a leader (eg. 3)
public class Find_leaders_in_an_array {

	public static void main(String[] args) {
		int[] a= {8,11,5,11,7,6,3};
		int curr_leader=a[a.length-1];
		System.out.println(curr_leader);
		for(int i=a.length-2;i>=0;i--) {
			if(a[i]>curr_leader) {
				curr_leader=a[i];
				System.out.println(curr_leader);
			}
		}
	}

}
