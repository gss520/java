package cn.guo.array;
/**
 * 数组的基本语法
 * @author Administrator
 *
 */
public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//声明
		int[] a;
		int b[];
		//创建数组
		a = new int[4];
		b = new int[5];
		
		//初始化(对数组元素的初始化)
		//默认初始化：数组元素相当于对象的成员变量，默认值嗯成员变量的规则一样，数字0，布尔false，char null
		a[0] = 23;
		a[1] = 23;
		
		//动态初始化
		for(int i = 0;i<a.length;i++){
			a[i] = i*12;
		}
		
		//静态初始化
		int c[] = {23,43,56,78};//长度是4，索引范围是0-3
		Car[] cars = {
						new Car("奔驰"),
						new Car("byd"),
						new Car("baoma")
				};
		Car c2 = new Car("奔驰");
		System.out.println(c2==cars[0]);
		
		
		
	}

}
