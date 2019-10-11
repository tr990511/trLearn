package cn.designPattern.action.template.memento;

public class Originator {
	private String state;

	public Memento createMemento() {
		return new Memento(state);
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setMemento(Memento memento) {
		// TODO Auto-generated method stub
		state = memento.getState();

	}

	public void show() {
		// TODO Auto-generated method stub
		System.out.println("State=" + state);
	}
}
