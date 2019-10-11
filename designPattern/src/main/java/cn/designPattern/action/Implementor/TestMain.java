package cn.designPattern.action.Implementor;

public class TestMain {

	public static void main(String[] args) {
		Abstraction ab=new AbstractionRefined();
		ab.setImplementor(new ImplementorConvreteA());
		ab.operetion();
		
		ab.setImplementor(new ImplementorConvreteB());
		ab.operetion();
	}

}
