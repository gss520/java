package mypro01;

import java.util.Scanner;

public class TestScanner {

	public static void test01(){
		Scanner s = new Scanner(System.in);
		String str = s.next();
		System.out.println("�ղ�����:"+str);
	}
	public static void test02(){
		Scanner s = new Scanner(System.in);
		System.out.println("������һ������:");
		int a = s.nextInt();
		System.out.println("������һ��������:");
		int b = s.nextInt();
		int sum = a+b;
		System.out.println("����������Ϊ��"+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test02();
	}

}
