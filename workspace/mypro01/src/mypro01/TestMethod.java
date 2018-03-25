package mypro01;

public class TestMethod {
	
	//设计方法的原则：方法的本意是功能块，就是实现某个功能语句的集合。
	//我们设计的方法方便以后的扩展
	public static void test01(int a){
		
		int oddSum = 0;//用来保存奇数的和
		int evenSum	= 0;
		for(int i=0;i<=a;i++){
			if(i%2!=0){
				oddSum +=i;
			}else{
				evenSum +=i;
			}
			
		}
		System.out.println("oddSum :"+oddSum);
		System.out.println("evenSum :"+evenSum);
	}
	
	public static void test02(int a,int b,int c){
		for(int j=1;j<=a;j++){
			if(j%b==0){
				System.out.print(j+"\t");
			}
			if(j%(b*c )==0){
				System.out.println();
			}
		}
	}
	
	public static int add(int a,int b){
		int sum = a+b;
		if(a==3){
			return 0;		//return两个作用，结束方法的运行，返回值
		}
		return sum;
	}
	
	public static void main(String[] args){
		test01(1000);    
		
		System.out.println("############");
		test02(100,6,4); 
		System.out.println("***********");
		int s = add(3,5);
		System.out.println(s);
	}
	

}
