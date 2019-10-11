package cn.designPattern.action.state;

public class Context {
	private State stateCurrent;
	private Integer hour;
	private Boolean endFlag;

	public Context() {
		this.stateCurrent = new StateForenoon();
	}

	public Context(State state) {
		this.stateCurrent = state;
	}

	public void doHandle() {
		stateCurrent.handle(this);

	}
	
	public State getStateCurrent() {
		return stateCurrent;
	}

	public void setStateCurrent(State stateCurrent) {
		this.stateCurrent = stateCurrent;
	}

	public Integer getHour() {
		return hour;
	}

	public void setHour(Integer hour) {
		this.hour = hour;
	}

	public Boolean getEndFlag() {
		return endFlag;
	}

	public void setEndFlag(Boolean endFlag) {
		this.endFlag = endFlag;
	}

}
