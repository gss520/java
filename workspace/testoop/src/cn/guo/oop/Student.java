package cn.guo.oop;

public class Student {
	//��̬������
	String name;
	int id;
	int age;
	String gender;
	int weight;
	
	Computer computer;
	
	
	//��̬����Ϊ
	public void study(){
		System.out.println(name+"��ѧϰ");
	}
	
	public void sayHello(String sname){
		System.out.println(name+"��"+sname+"˵����ã�");
	}

}
