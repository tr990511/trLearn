package cn.designPattern.create.prototype;

public class TestMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		Prototype pt=new Prototype("姓名");
		pt.setInfo("20", "2018");
		pt.setDetails("2018A", "2018B");
		
		Prototype pt1=(Prototype)pt.cloneQ();
		pt1.setInfo("21", "2019");
		pt1.setDetails("2019A", "2019B");
		
		pt.display();
		pt1.display();
		System.out.println("================");
		Prototype pt2=(Prototype)pt.cloneS();
		pt2.setInfo("21", "2020");
		pt2.setDetails("2020A", "2020B");
		pt2.display();
		pt1.display();
	}

}
