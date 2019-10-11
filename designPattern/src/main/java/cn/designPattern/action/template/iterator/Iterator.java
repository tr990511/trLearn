package cn.designPattern.action.template.iterator;

public abstract class Iterator {
	
	public abstract Object first();

	public abstract Object next();

	public abstract Boolean isDone();

	public abstract Object currentItem();
}
