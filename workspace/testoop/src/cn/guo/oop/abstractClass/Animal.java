package cn.guo.oop.abstractClass;

public abstract class Animal {
	String str;
	public abstract void run();
	public void breath(){
		System.out.println("����");
		run();
	}
	public Animal(){
		System.out.println("������");
		
		
	}
}

class Cat extends Animal{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("è��С��");
	}
	
}
class Dog extends Animal{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("����");
	}
	
}