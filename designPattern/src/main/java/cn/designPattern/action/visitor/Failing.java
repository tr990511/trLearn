package cn.designPattern.action.visitor;

public class Failing extends Action {
	@Override
	public void getManConclusion(Man concreteElementA) {
		System.out.println("Man Failing");
	}
	@Override
	public void getWomanConclusion(Woman concreteElementA) {
		System.out.println("Woman Failing");
	}
}
