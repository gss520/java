package cn.guo.oop.encapsulation;

public class Test01 {
	private String str;
	
	public void print(){
		String s = str;
		System.out.println("Test01.print()");
	}
	
	
}
class Test001 extends Test01{
	public void pp(){
		print();
	}
}
