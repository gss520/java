public class TestDataType{
	public static void main(String[] args){
		int a=10;
		byte b=20;
		int sum=1;
		for(int i=1;i<17;i++){
			sum*=2;
		}
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toOctalString(a));
		System.out.println(Integer.toHexString(a));
		System.out.println(b);
		System.out.println(sum);
		
		int a1=010;
		int a2=0xf;
		System.out.println(a1);
		System.out.println(a2);
		 
		long a3=12345678999L;
	}
}