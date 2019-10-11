package cn.designPattern.create.builder;

public class Diretor {
	public void construct(Builder builder) {
		builder.buildPartA();
		builder.buildPartB();
	}
}
