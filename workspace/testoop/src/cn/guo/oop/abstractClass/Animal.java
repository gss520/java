package cn.guo.oop.abstractClass;

public abstract class Animal {
	String str;
	public abstract void run();
	public void breath(){
		System.out.println("呼吸");
		run();
	}
	public Animal(){
		System.out.println("抽象类");
		
		
	}
}

class Cat extends Animal{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("猫步小跑");
	}
	
}
class Dog extends Animal{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("狗跑");
	}
	
}