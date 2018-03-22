package guo.cn;

public class InterfaceDemo {
	public static void start(Controllable ct){
		ct.start();
		ct.stop();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controllable ct = new Trunk();
		start(ct);
		
		ct = new Wifi();
		start(ct);
	}

}
