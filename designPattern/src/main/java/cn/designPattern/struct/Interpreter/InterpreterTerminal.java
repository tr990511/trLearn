package cn.designPattern.struct.Interpreter;

public class InterpreterTerminal extends AbstractInterpreter {

	@Override
	public void interpret(Context context) {
		System.out.println("非终端解析器");
	}

}
