package mypro01;

import java.util.Scanner;

public class TestScanner {

	public static void test01(){
		Scanner s = new Scanner(System.in);
		String str = s.next();
		System.out.println("刚才输入:"+str);
	}
	public static void test02(){
		Scanner s = new Scanner(System.in);
		System.out.println("请输入一个加数:");
		int a = s.nextInt();
		System.out.println("请输入一个被加数:");
		int b = s.nextInt();
		int sum = a+b;
		System.out.println("计算结果，和为："+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test02();
	}

}
