package mypro01;

public class TestRecursion {
	static int a = 0;
	public static void test01(){
		a++;
		System.out.println("TestRecursion.test01():"+a);
		if(a<=10){//�ݹ�ͷ
			test01();
			
		}else{//�ݹ���
			System.out.println("over!");
		}
	}
	public static void test02(){
		System.out.println("TestRecursion.test02()");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test01();
	}

}
