package cn.guo.oop.testinterface;

public class MyClass implements MyInterface{

	@Override
	public void test01() {
		// TODO Auto-generated method stub
//		MyInterface.MAX_GREAD="ab"; 
		System.out.println("test01");
	}

	@Override
	public int test02(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

}