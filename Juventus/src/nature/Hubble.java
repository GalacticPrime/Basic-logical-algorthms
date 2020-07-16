package nature;
import java.util.*;

public class Hubble {

	public static void main(String[] args) {
		Scanner gap = new Scanner(System.in);
		System.out.println("Enter the individual weights.");
		int yup = gap.nextInt();
		int totalLimit =1500,rat =0,temp=0;
		for(int i=1;i<=100;i++) {
			rat=rat+yup*i;
			if(rat>1500) {
				temp=i;
				break;
			}
		}
		System.out.println("Total number of persons is "+temp);

	}

}
