package nature;

public class Armstrong {

	public static void main(String[] args) {
		int temp = 0,sum=0,d=0;
		for(int i =0;i<=1000;i++) {
			temp=i;
			sum=0;
			while(temp>0) {
				d = temp%10;
				sum+=Math.pow(d,3);
				temp/=10;
			}
			if(sum==i) {
				System.out.println(sum);
			}
		}

	}

}
