package cn.designPattern.action.command;

public abstract class Command {
	protected Receiver receiver;

	public Command(Receiver receiver) {
		this.receiver = receiver;
	}

	abstract public void execute();
}
