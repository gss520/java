package homework;

import java.util.Scanner;

public class Route {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//初始化
		Scanner in = new Scanner(System.in);
//投入金额
		System.out.println("请投入金币：");
		int amount = in.nextInt();
//输出输入的金额
/*		double a = 1.0;
		double b = 0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1;
		
		System.out.println("a="+a+"   "+"b="+b);
		System.out.println(a-b);*/
		System.out.println(amount);
		System.out.println(amount>=10);
		System.out.println("购买的车票10元");
		System.out.println("*********");
		System.out.println("*********");
		System.out.println("找零："+(amount-10));
		
		
	}

}
