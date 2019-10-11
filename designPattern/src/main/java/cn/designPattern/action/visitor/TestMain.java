package cn.designPattern.action.visitor;

public class TestMain {

	public static void main(String[] args) {
		ObjectStructure o=new ObjectStructure();
		o.attach(new Man());
		o.attach(new Woman());
		Success v1=new Success();
		o.display(v1);
		System.out.println("===============");
		Failing v2=new Failing();
		o.display(v2);

	}

}
