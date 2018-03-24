package mypro01;

public class TestSwtich {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d = Math.random();
		int e = 1+(int)(d*6);		//[0,4]
		System.out.println(e);
		
		System.out.println("测试多选择结构");
		if(e==6){
			System.out.println("运气非常好！");
		}else if(e==5){
			System.out.println("运气很不错！");
		}else if(e>=4){
			System.out.println("运气不错！");
		}else{
			System.out.println("运气不好！");
		}
		
		System.out.println("##################");
		switch(e){
			//int,或者自动可以转成int的类型（byte,char,short）
		case 6:
			System.out.println("运气非常好！");
			break;
		case 5:
			System.out.println("运气很不错！");
			break;
		case 4:
			System.out.println("运气不错！");
			break;
		default:
			System.out.println("运气不好！");
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
			System.out.println("元音");
			break;
		case 'y':
		case 'z':
			System.out.println("半元音");
			break;
		default:
			System.out.println("辅音");
		}
	}

}
