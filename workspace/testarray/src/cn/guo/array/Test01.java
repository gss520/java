package cn.guo.array;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 1.数组是相同数据类型的有序集合
		2.数组也是对象，数组元素相当于对象的成员变量
		3.数组长度是确定的，不可变得。如果越界则报：arrayIndexOutofBoundsException*/
		int[] a = new int[3];
		a[0] = 23;
		a[1] = 28;
		a[2] = 32;
		double[] b = new double[2];
		Car[] cars = new Car[10];
		cars[0] = new Car("奔驰");
		
		System.out.println(cars[0].name);
		System.out.println(a.length);
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		
	}

}
