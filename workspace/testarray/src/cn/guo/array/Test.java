package cn.guo.array;

public class Test {
	public static void main(String[] args) {
		int[] s = null;
		s = new int[10];
		for(int i=0;i<10;i++){
			s[i] = 2*i+1;
			System.out.println(s[i]);
		}
		
		char[] z;
		z = new char[26];
		for(int i=0;i<26;i++){
			z[i] = (char)('a'+i);
			System.out.println(z[i]);
			
		}
		System.out.println("************");
		Test test = new Test();
		test.jisuan();
	}
	
	
	public  void jisuan(){
		char[] z;
		z = new char[26];
		for(int i=0;i<26;i++){
			z[i] = (char)('a'+i);
			System.out.println(z[i]);
		}
		
	}
}