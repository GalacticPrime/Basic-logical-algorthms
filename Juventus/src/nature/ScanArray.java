package nature;
import java.util.*;
public class ScanArray {

	public static void main(String[] args) {
		Scanner df = new Scanner(System.in);
		 System.out.println("Enter the size:");
		 int size =df.nextInt();
		 int[] ar = new int[size];
		 System.out.println("Enter the values. One by one.");
		 int sum=0;
		 for(int i=0;i<size;i++) {
			 ar[i]= df.nextInt();
			 sum+=ar[i];
		 }
		 System.out.println(Arrays.toString(ar));
		 System.out.println("Sum = "+sum);
         df.close();
	}

}
