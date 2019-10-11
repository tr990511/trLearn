package cn.designPattern.action.command;

public class TestMain {

	public static void main(String[] args) {
		System.out.println("===单一命令===");
		Receiver r1=new Receiver();
		Command c=new ConcreteCommandA(r1);
		Invoker i=new Invoker();
		i.setCommand(c);
		i.executeCommand();
		
		System.out.println();
		System.out.println("===命令列表===");
		Receiver r2=new Receiver();
		Command cA=new ConcreteCommandA(r2);
		Command cB=new ConcreteCommandB(r2);
		Invoker i2=new Invoker();
		i2.addCommand(cA);
		i2.addCommand(cB);
		i2.addCommand(cA);
		i2.addCommand(cB);
		i2.addCommand(cA);
		i2.cancelCommand(cB);
		i2.executeCommandLIst();
		
	}

}
