package cn.guo.array;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 1.��������ͬ�������͵����򼯺�
		2.����Ҳ�Ƕ�������Ԫ���൱�ڶ���ĳ�Ա����
		3.���鳤����ȷ���ģ����ɱ�á����Խ���򱨣�arrayIndexOutofBoundsException*/
		int[] a = new int[3];
		a[0] = 23;
		a[1] = 28;
		a[2] = 32;
		double[] b = new double[2];
		Car[] cars = new Car[10];
		cars[0] = new Car("����");
		
		System.out.println(cars[0].name);
		System.out.println(a.length);
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		
	}

}
