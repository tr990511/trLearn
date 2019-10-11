package cn.designPattern.action.mediator;

public class ColleagueConcreteA extends Colleague {
	public ColleagueConcreteA(Mediator mediator) {
		super(mediator);
	}
	public void send(String message) {
		mediator.send(message, this);
	}
	public void notify(String message) {
		System.out.println("同事CA获得消息:"+message);
	}
}
