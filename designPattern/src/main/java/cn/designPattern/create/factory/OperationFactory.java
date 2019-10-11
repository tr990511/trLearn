package cn.designPattern.create.factory;

public class OperationFactory {
	
	public static Operation createOperate(String operation) {
		Operation oper =null;
		switch (operation) {
		case "+":
			oper=new OperationAdd();
			break;
		case "-":
			oper=new OperationSub();
			break;
		}
		return oper;
	}
}
