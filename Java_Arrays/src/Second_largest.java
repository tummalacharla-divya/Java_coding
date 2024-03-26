import java.util.Arrays;

public class Second_largest {

	public static void main(String[] args) {
		int[] arr= {78,45,99,68,87,23};
		int max1=0,max2=0;
		if(arr[0]>arr[1]) {
			max1=arr[0];
			max2=arr[1];
		}
		else if(arr[0]<arr[1]) {
			max1=arr[1];
			max2=arr[0];
		}
		for(int i=2;i<arr.length;i++) {
			if(arr[i]>max1) {
				max2=max1;
				max1=arr[i];
			}
			else if(arr[i]>max2) {
				max2=arr[i];
			}
		}
		System.out.println("Second largest element is: "+max2);
		
		//another logic
		Arrays.sort(arr);
		int n=arr.length;
		System.out.println("Second largest element is: "+arr[n-2]);
		
	}

}
