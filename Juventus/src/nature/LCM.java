package nature;
import java.util.*;
public class LCM {

	public static void main(String[] args) {
	 Scanner s = new Scanner(System.in);
	 System.out.println("Enter the first number..");
	 int a = s.nextInt();
	 System.out.println("Enter the second number..");
	 int b = s.nextInt();
	 int one=0,two=0,count=0;
	 for(int i=1;i<=100;i++) {
		
		 for(int j=1;j<=100;j++) {
			 one=a*i;
			 two= b*j;
			 if(one==two)
				 System.out.println("The LCM is "+one);
			     count+=1;
			     
		 }
		 if(count==1)
			 break;
	 }
	}

}
