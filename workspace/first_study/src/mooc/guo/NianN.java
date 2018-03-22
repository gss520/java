package mooc.guo;

import java.util.Scanner;

public class NianN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner in = new Scanner(System.in);
		int integer = in.nextInt();
		int a=0;
		while(integer!=0){
			a=integer%10+a*10;
			integer=integer/10;
		}
		System.out.println(a);
		
		int b;
		while(integer!=0){
		b=integer%10;
		a=b+a*10;
		integer/=10;
		}
//			int temp;
//			int cnt=0;
//			if(integer==0){
//				System.out.print("ling");
//				
//			}
//			if(integer<0){
//				System.out.print("fu ");
//				integer=-integer;
//			}
//			  temp = integer;  
//			  while(temp>0)  
//			  {  
//			   temp/=10;  
//			   cnt++;      
//			  }
//			while(cnt>0){
//				double p;
//			   p =Math.pow(10,--cnt);  
//			   int n;  
//			   n = integer / (int)p;  
//			   integer = integer %(int)(p); 	
//			
//			switch(n){
//			case 0:System.out.print("ling");break;
//			case 1:System.out.print("yi");break;
//			case 2:System.out.print("er");break;
//			case 3:System.out.print("san");break;
//			case 4:System.out.print("si");break;
//			case 5:System.out.print("wu");break;
//			case 6:System.out.print("liu");break;
//			case 7:System.out.print("qi");break;
//			case 8:System.out.print("ba");break;
//			case 9:System.out.print("jiu");break;
//			}
//			if(cnt>0){
//			System.out.print(" ");
//			}
//		}
	}

}
