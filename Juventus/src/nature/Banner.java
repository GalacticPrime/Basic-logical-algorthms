package nature;

import java.util.Scanner;

public class Banner {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter a cool string:");
		String hp = sn.nextLine();
		System.out.println("You have entered: \n"+hp);
	    sn.close();
	}

}
