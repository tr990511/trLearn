package cn.designPattern.action.template;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractClass ac;
		ac=new ConcreteClassA();
		ac.templeMethod();
		System.out.println("===================");
		ac=new ConcreteClassB();
		ac.templeMethod();
		
	}

}
