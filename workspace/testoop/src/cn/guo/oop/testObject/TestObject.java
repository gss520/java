package cn.guo.oop.testObject;

public class TestObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj = new Object();
		Object obj2 = new Object();
		System.out.println(obj.toString());
		System.out.println(obj2.toString());
		System.out.println(obj==obj2);
		System.out.println(obj.equals(obj2));
		
		Mobile m = new Mobile();
		System.out.println(m.toString());
	}

}
