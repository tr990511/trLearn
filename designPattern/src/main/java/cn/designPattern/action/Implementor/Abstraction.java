package cn.designPattern.action.Implementor;

public class Abstraction {
	protected Implementor implementor;

	public void setImplementor(Implementor implementor) {
		this.implementor = implementor;
	}
	
	public void operetion() {
		implementor.operation();
	}
}
