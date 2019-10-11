package cn.designPattern.action.template;

abstract class AbstractClass {
	public abstract void primitiviveOperation1();
	public abstract void primitiviveOperation2();
	
	public void templeMethod() {
		System.out.println("模板内容。第一步");
		primitiviveOperation1();
		System.out.println("模板内容。。第二步");
		primitiviveOperation2();
		System.out.println("模板内容。。。。。");
	}
	
}
