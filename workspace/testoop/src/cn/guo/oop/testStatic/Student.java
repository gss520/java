package cn.guo.oop.testStatic;

public class Student {
	//静态的数据
	String name;
	int id;

	static int ss;
	public static void printSS(){
		System.out.println(ss);
	}
	//动态的行为
	public void study(){
		System.out.println(name+"在学习");
	}
	
	public void sayHello(String sname){
		System.out.println(name+"向"+sname+"说，你好！");
	}

}
