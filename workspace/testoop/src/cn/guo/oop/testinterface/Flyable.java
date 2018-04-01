package cn.guo.oop.testinterface;

public interface Flyable {
	int MAX_SPEED = 11000;
	int MIN_HIGHT = 1;
	void fly();
}

interface Attack{
	void attack();
}
class Plane implements Flyable{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("飞机依靠发动机在飞");
	}
	
}
class Man implements Flyable{
	
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("跳起来飞");
	}
	
}
class Stone implements Flyable,Attack{
	int weight;
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("被抛飞起来");
		System.out.println(weight);
	}
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("石头攻击");
	}
}



