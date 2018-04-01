package cn.guo.oop.polymorphism;

public class Test {

	public static void testAnimalVoice(Animal c){
		c.voice();
		if(c instanceof Cat){
			((Cat)c).catchMouse();
		}
	}
/*	public static void testAnimalVoice(Dog c){
		c.voice();
	}
	public static void testAnimalVoice(Pig c){
		c.voice();
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a = new Cat();
		Animal b = new Dog();
		Animal c = new Pig();
		Animal d = new Tiger();
		testAnimalVoice(a);
		testAnimalVoice(b);
		testAnimalVoice(c);
		testAnimalVoice(d);
		
		Cat a2 = (Cat)a;
		a2.catchMouse();
	}

}
