package cn.designPattern.struct.decorator;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComponentConcreate c=new ComponentConcreate();
		ConcreteDecoratorA dA=new ConcreteDecoratorA();
		ConcreteDecoratorB dB=new ConcreteDecoratorB();
		
		dA.setComponent(c);
		dB.setComponent(dA);
		dB.operation();
		
	}

}
