package nature;
import java.io.*;
import java.util.*;
public class BufferArray {

	public static void main(String[] args) throws IOException{
		 BufferedReader df = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Enter the size:");
		 int size = Integer.parseInt(df.readLine());
		 int[] ar = new int[size];
		 System.out.println("Enter the values. One by one.");
		 int sum=0;
		 for(int i=0;i<size;i++) {
			 ar[i]= Integer.parseInt(df.readLine());
			 sum+=ar[i];
		 }
		 System.out.println(Arrays.toString(ar));
		 System.out.println("Sum = "+sum);
	}

}
