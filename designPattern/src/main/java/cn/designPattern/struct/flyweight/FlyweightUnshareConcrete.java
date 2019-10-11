package cn.designPattern.struct.flyweight;

public class FlyweightUnshareConcrete extends Flyweight {

	@Override
	public void operation(Integer extrinsicstate) {
		System.out.println("不共享的具体Flyweight："+extrinsicstate);
	}

}
