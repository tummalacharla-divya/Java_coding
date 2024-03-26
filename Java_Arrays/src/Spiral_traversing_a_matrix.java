import java.util.ArrayList;
import java.util.List;

//leetcode #54
public class Spiral_traversing_a_matrix {

	public static void main(String[] args) {
		int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
		List<Integer> spiral=spiralOrder(a);
		System.out.println(spiral);
		
	}
	public static List<Integer> spiralOrder(int[][] a){
		int top=0,bottom=a.length-1;
		int left=0,right=a[0].length-1;
		ArrayList<Integer> result=new ArrayList<Integer>();
		while(top<=bottom && left<=right) {
			for(int i=left;i<=right;i++) {
				result.add(a[top][i]);
			}
			top++;
			for(int i=top;i<=bottom;i++) {
				result.add(a[i][right]);
			}
			right--;
			if(!(top<=bottom && left<=right)) {
				break;
			}
			for(int i=right;i>=left;i--) {
				result.add(a[bottom][i]);
			}
			bottom--;
			for(int i=bottom;i>=top;i--) {
				result.add(a[i][left]);
			}
			left++;
		}
		return result;
	}
}
