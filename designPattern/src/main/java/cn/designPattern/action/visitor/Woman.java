package cn.designPattern.action.visitor;

public class Woman extends Person {

	@Override
	public void accept(Action visitor) {
		visitor.getWomanConclusion(this);
	}

}
