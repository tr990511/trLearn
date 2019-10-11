package cn.designPattern.struct.adapter;

public class Adapter extends Target {
	private Adaptee adaptee=new Adaptee();
	@Override
	public void requset() {
		adaptee.specificRequset();
	}
}
