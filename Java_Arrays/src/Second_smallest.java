import java.util.Arrays;

public class Second_smallest {

	public static void main(String[] args) {
		int[] arr= {78,45,99,68,87,23};
		int min1=0,min2=0;
		if(arr[0]<arr[1]) {
			min1=arr[0];
			min2=arr[1];
		}
		else if(arr[0]>arr[1]) {
			min1=arr[1];
			min2=arr[0];
		}
		for(int i=2;i<arr.length;i++) {
			if(arr[i]<min1) {
				min2=min1;
				min1=arr[i];
			}
			else if(arr[i]<min2) {
				min2=arr[i];
			}
		}
		System.out.println("Second smallest number is : "+min2);
		
		
		//another simple approach
		Arrays.sort(arr);
		System.out.println("Second smallest number is : "+arr[1]);
	}

}
