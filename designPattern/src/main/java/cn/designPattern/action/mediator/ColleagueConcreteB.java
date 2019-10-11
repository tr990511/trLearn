package cn.designPattern.action.mediator;

public class ColleagueConcreteB extends Colleague {
	public ColleagueConcreteB(Mediator mediator) {
		this.mediator=mediator;
	}
	public void send(String message) {
		mediator.send(message, this);
	}
	public void notify(String message) {
		System.out.println("同事CB获得消息:"+message);
	}
}
