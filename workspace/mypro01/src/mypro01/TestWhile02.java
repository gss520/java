package mypro01;

public class TestWhile02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�žų˷���
/*		for(int m=1;m<=9;m++){
			
			for(int i=1;i<=m;i++){
				System.out.print(i+"*"+m+"="+(i*m)+"\t");
				
			}
			System.out.println();
		}*/
		
		//1-100�Ľ׳�֮��
		
		//ʹ������forѭ��
		double SumFactorial=0;
		for(int k=1;k<=100;k++){
			double Factorial = 1;
			for(int j=1;j<=k;j++){
				Factorial*=j;
			}
			SumFactorial+=Factorial;
			
		}
		System.out.println("1-100�Ľ׳�֮��Ϊ��"+SumFactorial);
		//ʹ��һ��forѭ��
		   double r=0, f=1;
		    int i;
		    for(i = 1; i <= 100; i ++)
		    {
		        f*=i;//i!
		        r+=f;
		    }
		    System.out.println("1-100�Ľ׳�֮��Ϊ��"+r);
		//1-100���ۼӺ�
//		    �ۼ�����forѭ��
			int SumAddition=0;
			for(int k=1;k<=100;k++){
				int Factorial = 0;
				for(int j=1;j<=k;j++){
					Factorial+=j;
				}
				SumAddition+=Factorial;
				
			}
			System.out.println("1-100���ۼ�֮��Ϊ��"+SumAddition);
			//�ۼ�һ��forѭ��
			    int h=0, n=0;
			    int m;
			    for(m = 1; m <= 100; m ++)
			    {
			        n+=m;//i!
			        h+=n;
			    }
			    System.out.println("1-100���ۼ�֮��Ϊ��"+h);
	}

}
