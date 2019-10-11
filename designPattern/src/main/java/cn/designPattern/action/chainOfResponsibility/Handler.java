package cn.designPattern.action.chainOfResponsibility;

abstract class Handler {
	protected Handler succesor;//继承者,上级
	public void setSuccesor(Handler succesor) {
		this.succesor=succesor;
	}
	public abstract void HandleRequest(Integer request);

}
