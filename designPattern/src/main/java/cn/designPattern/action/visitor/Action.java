package cn.designPattern.action.visitor;

public abstract class Action {
	public abstract void getManConclusion(Man concreteElementA);
	public abstract void getWomanConclusion(Woman concreteElementA);
}
