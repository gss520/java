package homework;

import java.util.Scanner;

public class Route {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//��ʼ��
		Scanner in = new Scanner(System.in);
//Ͷ����
		System.out.println("��Ͷ���ң�");
		int amount = in.nextInt();
//�������Ľ��
/*		double a = 1.0;
		double b = 0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1;
		
		System.out.println("a="+a+"   "+"b="+b);
		System.out.println(a-b);*/
		System.out.println(amount);
		System.out.println(amount>=10);
		System.out.println("����ĳ�Ʊ10Ԫ");
		System.out.println("*********");
		System.out.println("*********");
		System.out.println("���㣺"+(amount-10));
		
		
	}

}
