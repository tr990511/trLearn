package cn.designPattern.action.visitor;

public class Success extends Action {
	@Override
	public void getManConclusion(Man concreteElementA) {
		System.out.println("Man Success");
	}
	@Override
	public void getWomanConclusion(Woman concreteElementA) {
		System.out.println("Woman Success");
	}
}
