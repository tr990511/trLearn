package cn.designPattern.struct.flyweight;

import java.util.HashMap;

public class FlyweightFactory {
	private HashMap<String, Flyweight> flyweights=new HashMap<String, Flyweight>();
	public FlyweightFactory() {
		flyweights.put("X", new FlyweightConcrete());
		flyweights.put("Y", new FlyweightConcrete());
		flyweights.put("Z", new FlyweightConcrete());
	}
	public Flyweight getFlyweight(String key) {
		return (Flyweight)flyweights.get(key);
	}
	public Flyweight getFlyweightCreate(String key) {
		if(null==flyweights.get(key))  
			flyweights.put(key, new FlyweightConcrete() );
		return (Flyweight)flyweights.get(key);
	}
}
