package cn.guo.stringbuilder;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = new StringBuilder(32);
		StringBuilder sb2 = new StringBuilder("abcd");
		sb2.reverse();
		System.out.println("�ߵ�˳��"+sb2);
		
		//���Ǵ����String�ַ��ǲ��ܸı��
/*		String[] sb5 = {"12345","12312"};
		sb5.reverse();
		System.out.println("�ߵ�˳��"+sb5);*/
		sb2.append("efg");
		sb2.append(true).append(321).append("���");
		
		System.out.println(sb2);
		
		
		System.out.println("******************");
		StringBuilder gh = new StringBuilder("a");
		for(int i=0;i<100;i++){
			gh.append(i);
		}
		System.out.println(gh);
	}

}
