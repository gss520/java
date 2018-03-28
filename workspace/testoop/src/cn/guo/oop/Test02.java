package cn.guo.oop;

public class Test02 {
	public static void main(String[] args){
		Student s1 = new Student();
		s1.name = "¹ùË§";
		s1.age = 18;
		
		Computer c = new Computer();
		c.brand = "ºê»ù";
		c.cpuSpeed = 100;
		
		s1.computer = c;
		
		c.brand = "´÷¶û";
		System.out.println(s1.computer.brand);
		
		String str1 = "´÷¶û";
		System.out.println(str1==c.brand);
	}
}
