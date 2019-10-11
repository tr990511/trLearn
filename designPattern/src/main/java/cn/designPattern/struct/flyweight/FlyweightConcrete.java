package cn.designPattern.struct.flyweight;

public class FlyweightConcrete extends Flyweight {

	@Override
	public void operation(Integer extrinsicstate) {
		System.out.println("具体Flyweight："+extrinsicstate);
	}

}
