package cn.guo.oop.inherit;

public class Animal2 {
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
	public Animal2(){
		super();
		System.out.println("����һ�����");
	}
	public static void main(String[] args){
		Bird2 b = new Bird2();
		b.animal2.eat();
	}
}
class Mammal2{
	Animal2 animal2=new Animal2();
	public void taisheng(){
		System.out.println("����̥��");
		
	}
} 
class Bird2{
	Animal2 animal2=new Animal2();
	public void run(){
		animal2.run();
		System.out.println("����һֻСС���һ�ɣ�");
	}

	public void eggSheng(){
		System.out.println("����");
	}
	
	public Bird2(){
		super();
		System.out.println("��һ����Ķ���");
		
	}
}