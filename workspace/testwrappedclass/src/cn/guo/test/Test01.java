package cn.guo.test;
/**
 * ���԰�װ��
 * @author Administrator
 *
 */
public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i = new Integer(1000);
		System.out.println(Integer.toHexString(i));
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		Integer i2 = Integer.parseInt("234");
		Integer i3 = new Integer("333");
		System.out.println(i2+10);
		System.out.println(i3.intValue());
		
		String str = 23+" ";
		System.out.println(str);
	}

}