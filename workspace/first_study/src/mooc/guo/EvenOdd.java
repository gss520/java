package mooc.guo;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=0;
		int c;
		Scanner in = new Scanner(System.in);
		c = in.nextInt();
		while(c!=-1){
			if(c%2==0){
				a++;
			}				
			else{
				b++;
			}
			c = in.nextInt();
		}
		
		
		System.out.println(b+" "+a);
	}

}
