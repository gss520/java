public class TestCast{
	public static void main(String[] args){
		/*byte b = 123;
		//byte b2 = 300;
		//char c = -3;
		char c2 = 'a';
		int i = c2;
		long d01 = 12312;
		float f = d01;
		
		int i2 = 100;
		char c3 = (char)i2;
		System.out.println(c3);*/
		
		//表达式中的类型提升的问题
		/*int a = 3;
		long b = 4;
		int c = (int )(a+b);
		
		double d = 5.3;
		float f = (float)(a+d);
		System.out.println(c);
		*/
		
		int money = 1000000000;
		int years = 20;
		long total =(long)money*years;
		System.out.println(total);
		
		long time = 70*60*24*365*70L;
		System.out.println(time);
		
	}
}