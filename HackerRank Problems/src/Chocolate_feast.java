
public class Chocolate_feast {

	public static void main(String[] args) {
		int n=15,c=3,m=2;//n is money, c is cost of one chocolate, m is n.of wrappers to exchange and get one chocolate
		int choco=n/c;
		int wrap=choco;
		while(wrap>=m) {
			int new_choco=wrap/m;
			choco=choco+new_choco;
			wrap=wrap%m+new_choco;
		}
		System.out.println(choco);
	}

}
