package mypro01;

public class TestSwtich {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d = Math.random();
		int e = 1+(int)(d*6);		//[0,4]
		System.out.println(e);
		
		System.out.println("���Զ�ѡ��ṹ");
		if(e==6){
			System.out.println("�����ǳ��ã�");
		}else if(e==5){
			System.out.println("�����ܲ���");
		}else if(e>=4){
			System.out.println("��������");
		}else{
			System.out.println("�������ã�");
		}
		
		System.out.println("##################");
		switch(e){
			//int,�����Զ�����ת��int�����ͣ�byte,char,short��
		case 6:
			System.out.println("�����ǳ��ã�");
			break;
		case 5:
			System.out.println("�����ܲ���");
			break;
		case 4:
			System.out.println("��������");
			break;
		default:
			System.out.println("�������ã�");
			break;
		}
		System.out.println("---------------------");
		char c = 'a';
		int rand = (int)(26*Math.random());
		char c2 = (char)(c+rand);
		System.out.print(c2+":");
		switch(c2){
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("Ԫ��");
			break;
		case 'y':
		case 'z':
			System.out.println("��Ԫ��");
			break;
		default:
			System.out.println("����");
		}
	}

}
