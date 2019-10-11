package cn.designPattern.create.singletion;

public class Singletion {
	private static Singletion instance;
	private Singletion() {
		
	}
	public static Singletion getInstance() {
		if (null==instance) {
			instance=new Singletion();
		}
		return instance;
	}
}
