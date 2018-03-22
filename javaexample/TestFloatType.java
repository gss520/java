public class TestFloatType{
	public static void main(String[] args){
		double d = 3.14;		//浮点数常量默认的是double
		float f = 6.28F;
		
		double d2 = 314E-2;
		System.out.println(d2);
		
		float f1 = 0.1f;
		double d3 = 1.0/10;
		System.out.println(d2==d3);
	}
}