package cn.guo.oop.polymorphism;

public class Animal {
	public void voice(){
		System.out.println("��ͨ����Ľ���");
	}
}

class Cat extends Animal{
	public void voice(){
		System.out.println("miaomiao");
	}
	public void catchMouse(){
		System.out.println("ץ����");
	}
}
class Dog extends Animal{
	public void voice(){
		System.out.println("wangwang");
	}
	public void seeDoor(){
		System.out.println("����");
	}
}
class Pig extends Animal{
	public void voice(){
		System.out.println("hengheng");
	}
}
class Tiger extends Animal{
	public void voice(){
		System.out.println("wawa");
	}
	
}
