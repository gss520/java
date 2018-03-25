package mypro01;

public class Factorial {
	
	static long factorial(int n){
		if(n==1){
			return 1;	
		}else{
			return n*factorial(n-1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long s = factorial(5);
		System.out.println(s);
	}

}
