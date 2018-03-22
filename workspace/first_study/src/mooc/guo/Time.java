package mooc.guo;

import java.util.Scanner;

public class Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int utc;int a;int b;
		Scanner in = new Scanner(System.in);
		int bjt = in.nextInt();
		
		a = bjt/100;
		b = bjt%100;
		if(a>7)
			utc = (a-8)*100+b;
		else
			utc = (a+24-8)*100+b;
		
		System.out.println(utc);
	}

}
