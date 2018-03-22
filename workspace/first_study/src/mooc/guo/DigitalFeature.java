 package mooc.guo;

import java.util.Scanner;

public class DigitalFeature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("number:");
		int n = in.nextInt();
		int i;
		int a;
		int count=0;
		int sum=0;
		for(i=1;i<=n+count;i++){
			
			a=n%10;
			if(a%2==i%2){
				sum+= Math.pow(2, (i-1));
				count++;

			}
			n/=10;
			
		}
		System.out.println(sum);
	}

}




