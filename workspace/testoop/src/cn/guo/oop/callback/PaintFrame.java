package cn.guo.oop.callback;

public class PaintFrame {
	public static void drawFrame(IMyFrame f){
		System.out.println("�����߳�");
		System.out.println("����ѭ��");
		System.out.println("�鿴��Ϣ");
		
		//������
		f.paint();
		
		System.out.println("���ӻ��棬����Ч��");
	}
	public static void main(String[] args) {
		drawFrame(new GameFrame02());
	}
}

class GameFrame01 implements IMyFrame{
	public void paint(){
		System.out.println("GameFrame01.paint()");
		System.out.println("������");
	}
}
class GameFrame02 implements IMyFrame{
	public void paint(){
		System.out.println("GameFrame02.paint()");
		System.out.println("������");
	}
}