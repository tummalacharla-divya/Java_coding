
public class Length_of_consecutive_ones_in_binary_representation {

	public static void main(String[] args) {
		System.out.println("consecutive ones are there :"+isConsecutive(101));
		System.out.println("no.of consecutive ones are :"+count(101));
	}

	private static int count(int n) {
		int count=0;
		while(n!=0) {
			n=(n&(n<<1));
			count++;
		}
		return count;
	}

	private static boolean isConsecutive(int n) {
		return (n&(n<<1))!=0;
	}

}
