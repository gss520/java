package cn.guo.oop.testStatic;

public class Student {
	//��̬������
	String name;
	int id;

	static int ss;
	public static void printSS(){
		System.out.println(ss);
	}
	//��̬����Ϊ
	public void study(){
		System.out.println(name+"��ѧϰ");
	}
	
	public void sayHello(String sname){
		System.out.println(name+"��"+sname+"˵����ã�");
	}

}
