package cn.guo.oop.inherit;

public class Animal {
	String eye;
	
	public void run(){
		System.out.println("跑跑！");
	}
	
	public void eat(){
		System.out.println("吃吃！");
	}
	
	public void sleep(){
		System.out.println("zzzzzz");
		
	}
}

class Mammal extends Animal{
	
	public void taisheng(){
		System.out.println("我是胎生");
		
	}
} 

class Bird extends Animal{
	public void run(){
		 
		System.out.println("我是一只小小鸟，我会飞！");
	}

	public void eggSheng(){
		System.out.println("卵生");
	}
}
