package nature;

public class Fibonnaci {

	public static void main(String[] args) {
		int n1=0,n2=1,t=0;
		System.out.println(0);
		for(int i=2;i<=20;i++) {
			t = n1+n2;
			System.out.println(t);
			n1 = n2;
			n2 = t;
			
		}

	}

}
