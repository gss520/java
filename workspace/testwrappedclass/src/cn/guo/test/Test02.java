package cn.guo.test;
/**
 * 
 * �����Զ�װ��Ͳ���
 */
 
public class Test02 {
	public static void main(String[] args) {
//		Integer a = new Integer(1000);
		Integer a = 1000;//�Զ�װ�䣬�������Ľ�����Integer a = new Integer(100)
		
		Integer b = 2000;
		int c = b; //�Զ����䣬�������Ľ���b.IntValue();
		
		System.out.println(c);
		
		Integer d = 1234;
		Integer d2 = 1234;
		System.out.println(d==d2);
		System.out.println(d.equals(d2));

		System.out.println("**********");
		Integer d3 = -123;//[-128,127]֮���������Ȼ������������������������
		Integer d4 = -123;
		System.out.println(d3==d4);
		System.out.println(d3.equals(d4));
		
	}
}