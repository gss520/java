package guo.divisor;

import java.util.Scanner;

public class Divisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
		int n = 96;
		int m = 28;
		while(m!=0){
			temp = n%m;
			n = m;
			m = temp;
		}
		System.out.println(n);
		System.out.println("«Î ‰»Î£∫");
		Scanner in = new Scanner(System.in);
		System.out.println(in.nextLine());
		System.out.println(2+3+"=2+3£°="+2+3);
	}

}
