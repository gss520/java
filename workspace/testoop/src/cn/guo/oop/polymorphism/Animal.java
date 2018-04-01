package cn.guo.oop.polymorphism;

public class Animal {
	public void voice(){
		System.out.println("普通动物的叫声");
	}
}

class Cat extends Animal{
	public void voice(){
		System.out.println("miaomiao");
	}
	public void catchMouse(){
		System.out.println("抓老鼠");
	}
}
class Dog extends Animal{
	public void voice(){
		System.out.println("wangwang");
	}
	public void seeDoor(){
		System.out.println("看门");
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
