
public class Number_Line_jumps {

	public static void main(String[] args) {
		int x1=0,v1=3,x2=2,v2=1;
		System.out.println(Kangroo(x1,v1,x2,v2));
	}
	static String Kangroo(int x1,int v1,int x2,int v2) {
		int newX1=x1;
		int newX2=x2;
		if(v1<v2) {
			return "No";
		}
		while(newX1<newX2) {
			newX1=newX1+v1;
			newX2=newX2+v2;
			if(newX1==newX2) {
				return "Yes";
			}
		}
		return "No";
	}

}
