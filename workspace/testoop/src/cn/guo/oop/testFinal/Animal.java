package cn.guo.oop.testFinal;
//�̳�
public class Animal {
	String eye;
	
	public void run(){
		System.out.println("���ܣ�");
	}
}


class Bird extends Animal{
	public void run(){
		 super.run();
		System.out.println("����һֻСС���һ�ɣ�");
	}


}
