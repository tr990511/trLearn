package cn.designPattern.struct.decorator;

public class ConcreteDecoratorB extends Decorator {

	@Override
	public void operation() {
		super.operation();
		addedBehavior();
		System.out.println("执行了B");
	}
	private void addedBehavior(){
		System.out.println("具体装饰对象B函数操作：");
	}
}
