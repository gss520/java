package cn.guo.oop.testThis;

public class Student {
	//��̬������
	String name;
	int id;

	public Student(String name,int id){
		this(name);		//ͨ��this���������ķ���������λ�ڵ�һ��
		this.name = name;
		this.id = id;
	}
	
	public Student(String name){
		this.name = name;
	}
	public Student(){
		System.out.println("����һ������");
	}
	
	public void setName(String name){
		this.name = name;
	}
	public void study(){
		System.out.println(name+"��ѧϰ");
	}
	
	public void sayHello(String sname){
		System.out.println(name+"��"+sname+"˵����ã�");
	}

}
