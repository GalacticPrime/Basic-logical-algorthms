package nature;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the number:");
    int t = s.nextInt();
    int fact = 1;
    for(int i=1;i<=t;i++) {
    	fact*=i;
    }
    System.out.println("Factorial: "+fact);
    s.close();
	}

}
