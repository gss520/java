package homework;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int F;
		Scanner in = new Scanner(System.in);
		F = (int)in.nextInt();
		System.out.println((F-32)*5/9);
	}

}
