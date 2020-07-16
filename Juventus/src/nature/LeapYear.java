package nature;
import java.util.*;

public class LeapYear {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the year..");
		int year = s.nextInt();
		if(year%4==0) {
			System.out.println(year+" is a leap year.");
		}
		else {
			System.out.println(year+" is not a leap year.");
		}
		String got = "I got it!";
		int l = got.length();
		char[] arr = new char[l];
		arr = got.toCharArray();
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.toString());
		

	}

}
