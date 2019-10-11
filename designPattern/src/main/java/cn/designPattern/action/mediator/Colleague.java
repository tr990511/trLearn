package cn.designPattern.action.mediator;
/* 
 * 抽象同事类
 * */
public abstract class Colleague {
	protected Mediator mediator;
	public Colleague() {
		System.out.println("空");
	};
	public Colleague(Mediator mediator) {
		System.out.println("Mediator mediator");
		this.mediator=mediator;

	}
}
