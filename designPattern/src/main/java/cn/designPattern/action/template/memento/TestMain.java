package cn.designPattern.action.template.memento;

public class TestMain {

	public static void main(String[] args) {
		Originator o=new Originator();
		System.out.println("初始状态······");
		o.setState("On");
		o.show();
		
		Caretaker c=new Caretaker();
		c.setMemento(o.createMemento());
		
		System.out.println("设新状态······");
		o.setState("Off");
		o.show();
		
		System.out.println("还原状态······");
		o.setMemento(c.getMemento());
		o.show();
	}

}
