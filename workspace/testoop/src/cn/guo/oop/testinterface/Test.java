package cn.guo.oop.testinterface;

public class Test {
	public static void main(String[] args) {
		Flyable f = new Stone();
		((Stone)f).weight=5;
		
		f.fly();
	}
}
