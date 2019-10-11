package cn.designPattern.create.singletion;

public class TestMain {

	public static void main(String[] args) {
		Singletion s1=Singletion.getInstance();
		Singletion s2=Singletion.getInstance();
		if (s1==s2) {
			System.out.println("两个对象是相同实例");
		}
	}

}
