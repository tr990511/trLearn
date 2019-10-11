package cn.designPattern.struct.facade;

public class Facade {
	SubSystemA sA;
	SubSystemB sB;
	SubSystemC sC;

	public Facade() {
		sA = new SubSystemA();
		sB = new SubSystemB();
		sC = new SubSystemC();
	}
	public void methodOne() {
		System.out.println("方法组one");
		sA.methodA();
		sB.methodB();
		sC.methodC();
		System.out.println("=========");
	}
	public void methodTwo() {
		System.out.println("方法组two");
		sA.methodA();
		sB.methodB();
		System.out.println("=========");
	}
}
