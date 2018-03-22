package homework;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("请输入你的年龄：");
		Scanner in = new Scanner(System.in);
		int amount = in.nextInt();
		if(amount<20){
			System.out.println("你真年轻！");
		}
		System.out.println("时间是最好的消磨器，青春真好！");
		
		
	}

}
