package cn.guo.oop.inherit;

public class Animal {
	String eye;
	
	public void run(){
		System.out.println("���ܣ�");
	}
	
	public void eat(){
		System.out.println("�Գԣ�");
	}
	
	public void sleep(){
		System.out.println("zzzzzz");
		
	}
}

class Mammal extends Animal{
	
	public void taisheng(){
		System.out.println("����̥��");
		
	}
} 

class Bird extends Animal{
	public void run(){
		 
		System.out.println("����һֻСС���һ�ɣ�");
	}

	public void eggSheng(){
		System.out.println("����");
	}
}
