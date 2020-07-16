package nature;
import java.util.*;

public class Reverse {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = s.nextInt();
		int t = num;
		int r=0,d=0;
		while(t>0) {
			d = t%10;
			r = r*10+d;
			t/=10;
		}
   System.out.println("The reverse of "+num+" is "+r+".");
   if(r==num) {
	   System.out.println("The number "+num+" is a palindrome number");
   }
   else {
	   System.out.println("The number "+num+" is not a palindrome number");
   }
	}

}
