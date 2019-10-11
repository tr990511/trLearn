package cn.designPattern.struct.Interpreter;

public class InterpreterNonterminal extends AbstractInterpreter {

	@Override
	public void interpret(Context context) {
		System.out.println("终端解析器");
	}

}
