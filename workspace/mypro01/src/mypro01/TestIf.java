package mypro01;

//����if���

public class TestIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d = Math.random();
		int e = 1+(int)(d*6);		//[0,4]
		System.out.println(e);
		
		if(e>3){
			System.out.println("������");
			
		}else{
			System.out.println("С����");
		}
		
		System.out.println("���Զ�ѡ��ṹ");
		if(e==6){
			System.out.println("�����ǳ��ã�");
		}else if(e>=4){
			System.out.println("�����ã�");
		}else if(e>=2){
			System.out.println("��������");
		}else{
			System.out.println("�����");
		}
		
	}

}
