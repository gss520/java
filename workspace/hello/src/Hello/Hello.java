package Hello;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int foot,inch;

		Scanner in = new Scanner(System.in);
		foot = in.nextInt();
		inch = in.nextInt();
		System.out.println((foot+inch/12)*0.3048);
		System.out.println((foot+inch/12.0)*0.3048);
	}

}
