package nature;
import java.util.*;
public class Change {

	public static void main(String[] args) {
		Scanner yu = new Scanner(System.in);
		System.out.println("Enter a:");
		int a = yu.nextInt();
		System.out.println("Enter b:");
		int b = yu.nextInt();
        System.out.println("a="+a+", b="+b);
        int q = 0;
        q=a;
        a=b;
        b=q;
        System.out.println("New values:");
        System.out.println("a="+a+", b="+b);
				
	}

}
