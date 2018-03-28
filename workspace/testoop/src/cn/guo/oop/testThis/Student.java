package cn.guo.oop.testThis;

public class Student {
	//静态的数据
	String name;
	int id;

	public Student(String name,int id){
		this(name);		//通过this调用其他的方法，必须位于第一句
		this.name = name;
		this.id = id;
	}
	
	public Student(String name){
		this.name = name;
	}
	public Student(){
		System.out.println("构造一个对象");
	}
	
	public void setName(String name){
		this.name = name;
	}
	public void study(){
		System.out.println(name+"在学习");
	}
	
	public void sayHello(String sname){
		System.out.println(name+"向"+sname+"说，你好！");
	}

}
