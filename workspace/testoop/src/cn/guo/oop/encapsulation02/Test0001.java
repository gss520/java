package cn.guo.oop.encapsulation02;

import cn.guo.oop.encapsulation.Test01;

public class Test0001 extends Test01{

	public void ttt(){
		super.print();
		print();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test0001 t = new Test0001();
		t.print();
	}

}