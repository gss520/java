package mypro01;

public class TestWihle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 1;//��ʼ��
		
		while(a<=100){//�����ж�
			System.out.println(a);//ѭ����
			a++;//����
		}
		System.out.println("whileѭ������");
		
		//����1+2+3+...+100
		int b = 1;
		int sum = 0;
		while(b<=100){
			sum = sum+b;
			b++;
		}
		System.out.println("��Ϊ��"+sum);
		
		//dowhile and while
		int c = 0;
		
		while(c<0){
			System.out.println("c=0");
			c++;
		}
		
		
		System.out.println("__________");
		do{
			System.out.println("c=0");
			c++;
		}while(c<0);
	}

}
