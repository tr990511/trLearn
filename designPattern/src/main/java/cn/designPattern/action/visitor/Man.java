package cn.designPattern.action.visitor;

public class Man extends Person {

	@Override
	public void accept(Action visitor) {
		visitor.getManConclusion(this);
	}

}
