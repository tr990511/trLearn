package cn.designPattern.struct.proxy;

public class Proxy extends Subject {
	RealSubject realSubject;
	@Override
	public void request() {
		if(null==realSubject) {
			realSubject=new RealSubject();
		}
		realSubject.request();
	}

}
