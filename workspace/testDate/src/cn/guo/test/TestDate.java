package cn.guo.test;

import java.util.Date;

public class TestDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		long t = System.currentTimeMillis();
		System.out.println(t);
		Date d2 = new Date(1000);
		System.out.println(d2.toGMTString());
		d2.setTime(24654564);
		System.out.println(d2.getTime());
		System.out.println(d.getTime()<d2.getTime());
				
	}

}
