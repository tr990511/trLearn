package cn.designPattern.action.command;
/*
 * 
 */
public class ConcreteCommandA extends Command {
	public ConcreteCommandA(Receiver receiver) {
		super(receiver);
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		receiver.actionA();
	}

}
