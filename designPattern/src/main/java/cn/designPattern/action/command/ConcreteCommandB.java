package cn.designPattern.action.command;
/*
 * 
 */
public class ConcreteCommandB extends Command {
	public ConcreteCommandB(Receiver receiver) {
		super(receiver);
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		receiver.actionB();
	}

}
