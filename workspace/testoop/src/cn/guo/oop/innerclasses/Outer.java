package cn.guo.oop.innerclasses;

import cn.guo.oop.innerclasses.Face.Nose;

public class Outer {
	public static void main(String[] args) {
		
		Face f = new Face();
		Face.Nose n = f.new Nose();
		n.breath();
		Face.Ear e = new Face.Ear();
		e.listen();
	}
}

class Face{
	int type=5;
	String shape = "������";
	static String color="����";
	
	class Nose{
		String type;
		
		void breath(){
			
			System.out.println(Face.this.type);
			System.out.println("����");
			System.out.println(shape);
			
		}
	}
	static class Ear{
		void listen(){
			
			System.out.println(color);
			System.out.println("������");
		}
	}
}