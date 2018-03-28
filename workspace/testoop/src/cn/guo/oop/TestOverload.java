package cn.guo.oop;

public class TestOverload {
	public static void main(String[] args){
		MyMath m= new MyMath();
		int result = m.add(4,5);
		int result4 = m.add(2,4.2);
		int result3 = m.add(4.2,2);
		int result2 = m.add(1,2,3);
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}
}

class MyMath{
	int a;
	int b;
	
	public MyMath(){
		
	}
	public MyMath(int a){
		this.a = a;
	}
	public MyMath(int b,int a){
		this.a = a;
		this.b = b;
	}
	public int add(int a, double b){
		return (int)(a+b);
	}
	public int add(double a, int b){
		return (int)(a-b);
	}
	public int add(int a, int b){
		return a+b;
	}
	public int add(int a,int b,int c){
		return a+b+c;
	}
}
