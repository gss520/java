package cn.guo.oop.String;

import java.util.Scanner;

public class CountString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("�������ַ�����");
		String str = sc.nextLine();
		int charr=0;
		int charR=0;
		int sum=0;
		int fuhao=0;
		int space=0;
		for(int i=0;i<str.length();i++){
			char a = str.charAt(i);
			if(a>='a'&&a<='z'){
				charr++;
			}else if(a>='A'&&a<='Z'){
				charR++;
			}else if(a==' '){
				space++;
			}else if(a>='0'&&a<='9'){
				sum++;
			}else{
				fuhao++;
			}
		}
		System.out.println("Сд��ĸ"+charr);
		System.out.println("��д��ĸ"+charR);
		System.out.println("����"+sum);
		System.out.println("�ո�"+space);
		System.out.println("����"+fuhao);
		
	}


}