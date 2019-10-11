package cn.designPattern.action.command;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Date;

public class Invoker {
	private Command command;
	private AbstractList<Command> commandArray = new ArrayList<Command>();

	public void setCommand(Command command) {
		this.command = command;
	}

	public void executeCommand() {
		command.execute();
	}
	/**        多命令       **/
	public void addCommand(Command command) {
		System.out.println("增加订单：" + new Date().toString());
		commandArray.add(command);
	}

	public void cancelCommand(Command command) {
		System.out.println("移除订单：" + new Date().toString());
		commandArray.remove(command);
	}

	public void executeCommandLIst() {
		for (Command command : commandArray) {
			command.execute();
		}
	}
}
