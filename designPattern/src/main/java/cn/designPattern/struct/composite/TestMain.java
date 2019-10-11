package cn.designPattern.struct.composite;

public class TestMain {

	public static void main(String[] args) {
		Composite root=new Composite("root");
		root.add(new Leaf("Leaf A"));
		root.add(new Leaf("Leaf B"));
		
		Composite compX=new Composite("Composite X");
		compX.add(new Leaf("Leaf XA"));
		compX.add(new Leaf("Leaf XB"));
		root.add(compX);
		
		Composite compY=new Composite("Composite Y");
		compY.add(new Leaf("Leaf YA"));
		compY.add(new Leaf("Leaf YB"));
		root.add(compY);
		
		root.add(new Leaf("Leaf C"));
		Leaf leafD=new Leaf("Leaf D");
		root.add(leafD);
		root.remove(leafD);
		
		root.display(2);
		System.out.println("==============");
		compY.display(2);
		
	}

}
