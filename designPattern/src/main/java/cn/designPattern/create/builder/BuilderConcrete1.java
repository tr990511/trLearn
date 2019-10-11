package cn.designPattern.create.builder;

public class BuilderConcrete1 extends Builder {
	private Product product=new Product();
	@Override
	public void buildPartA() {
		product.add("部件 A");
	}

	@Override
	public void buildPartB() {
		product.add("部件 B");
	}

	@Override
	public Product getResult() {
		return product;
	}

}
