package cn.guo.array;
/**
 * ����Ļ����﷨
 * @author Administrator
 *
 */
public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����
		int[] a;
		int b[];
		//��������
		a = new int[4];
		b = new int[5];
		
		//��ʼ��(������Ԫ�صĳ�ʼ��)
		//Ĭ�ϳ�ʼ��������Ԫ���൱�ڶ���ĳ�Ա������Ĭ��ֵ�ų�Ա�����Ĺ���һ��������0������false��char null
		a[0] = 23;
		a[1] = 23;
		
		//��̬��ʼ��
		for(int i = 0;i<a.length;i++){
			a[i] = i*12;
		}
		
		//��̬��ʼ��
		int c[] = {23,43,56,78};//������4��������Χ��0-3
		Car[] cars = {
						new Car("����"),
						new Car("byd"),
						new Car("baoma")
				};
		Car c2 = new Car("����");
		System.out.println(c2==cars[0]);
		
		
		
	}

}