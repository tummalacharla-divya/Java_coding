import java.util.HashMap;
import java.util.Map;

public class Majority_element_part1 {

	public static void main(String[] args) {
		/*
		 * int [] arr= {8,5,8,1,2,8,8};
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i], map.getOrDefault(arr[i],0)+1);
		}
		for(Map.Entry<Integer, Integer> i:map.entrySet()) {
			if(i.getValue()>arr.length/2) {
				int res=i.getKey();
				System.out.println(res);
			}
		}
		 */
		int [] arr= {8,5,8,1,2,8,8};
		for(int i=0;i<arr.length;i++) {
			int c=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					c++;
				}
			}
			if(c>arr.length/2) {
				System.out.println(arr[i]);
			}
		}
	}

}
