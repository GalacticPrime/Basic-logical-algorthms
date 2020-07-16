package nature;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffer {

	public static void main(String[] args) throws IOException{
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a cool string:");
		String hp = bfr.readLine();
		System.out.println("You have entered: \n"+hp);
		
		
		
		
		
	}

}
