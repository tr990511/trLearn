package cn.designPattern.create.builder;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Diretor diretor=new Diretor();
		Builder b1=new BuilderConcrete1();
		Builder b2=new BuilderConcrete2();
		diretor.construct(b1);
		Product p1=b1.getResult();
		p1.show();
		
		diretor.construct(b2);
		Product p2=b2.getResult();
		p2.show();
	}

}
