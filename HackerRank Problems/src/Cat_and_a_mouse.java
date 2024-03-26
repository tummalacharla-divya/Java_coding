
public class Cat_and_a_mouse {

	public static void main(String[] args) {
		int x=2,y=4,z=5;
		System.out.println(catAndMouse(x,y,z));
	}
	static String catAndMouse(int x,int y,int z) {
		//int d1=Math.abs(x-z);
		//int d2=Math.abs(y-z);
		int d1=0;
		int d2=0;
		if(x<=z) {
			d1=z-x;
		}
		else {
			d1=x-z;
		}
		if(y<=z) {
			d2=z-y;
		}
		else {
			d2=y-z;
		}
		if(d1==d2) {
			return "Mouse c";
		}
		else if(d1<d2) {
			return "Cat A";
		}
		else {
			return "Cat B";
		}
	}

}
