package cn.designPattern.struct.flyweight;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int extrinsicstate=22;
		FlyweightFactory ff=new FlyweightFactory();
		Flyweight fx =ff.getFlyweight("X");
		fx.operation(--extrinsicstate);
		
		Flyweight fy =ff.getFlyweight("Y");
		fy.operation(--extrinsicstate);
		
		Flyweight fz =ff.getFlyweight("Z");
		fz.operation(--extrinsicstate);
		
		Flyweight fc =ff.getFlyweightCreate("C");
		fc.operation(--extrinsicstate);
		System.out.println("---------------");
		Flyweight fu =new FlyweightUnshareConcrete();
		fu.operation(--extrinsicstate);
	}

}
