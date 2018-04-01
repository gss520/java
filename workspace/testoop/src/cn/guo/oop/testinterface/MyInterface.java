package cn.guo.oop.testinterface;

public interface MyInterface {
	//接口 中只有常量和抽象方法
	/*pubic static final 接口中常量定义时，写或不写都是这样的*/String MAX_GREAD = "BOSS";
	int MAX_SPEED = 120;
	
	public void test01();
	public int test02(int a,int b);
}
