package cn.guo.oop.testFinal;
//继承
public class Animal {
	String eye;
	
	public void run(){
		System.out.println("跑跑！");
	}
}


class Bird extends Animal{
	public void run(){
		 super.run();
		System.out.println("我是一只小小鸟，我会飞！");
	}


}
