package mypro01;
//测试while和for的练习题
public class TestWhileFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int oddSum = 0;//用来保存奇数的和
		int evenSum	=0;
		for(int i=0;i<=100;i++){
			if(i%2!=0){
				oddSum +=i;
			}else{
				evenSum +=i;
			}
		
		}
		System.out.println("oddSum :"+oddSum);
		System.out.println("evenSum :"+evenSum);
		
		System.out.println("############");
		
		for(int j=1;j<=1000;j++){
			if(j%5==0){
				System.out.print(j+"\t");
			}
			if(j%(5*4 )==0){
				System.out.println();
			}
		}
		
		
	}

}
