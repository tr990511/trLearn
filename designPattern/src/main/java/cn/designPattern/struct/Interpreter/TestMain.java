package cn.designPattern.struct.Interpreter;

import java.util.ArrayList;
import java.util.List;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context context=new Context();
		List<AbstractInterpreter> list=new ArrayList<AbstractInterpreter>();
		list.add(new InterpreterTerminal());
		list.add(new InterpreterTerminal());
		list.add(new InterpreterNonterminal());
		list.add(new InterpreterTerminal());
		for (AbstractInterpreter exp : list) {
			exp.interpret(context);
		}
	}

}
