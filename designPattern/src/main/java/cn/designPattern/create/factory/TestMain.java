package cn.designPattern.create.factory;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation oper;
		Double result;
		oper=OperationFactory.createOperate("+");
		oper.setNumberA(5);
		oper.setNumberB(9);
		result=oper.getResult();
		System.out.println("结果为："+result.toString());
		oper=OperationFactory.createOperate("-");
		oper.setNumberA(5); 
		oper.setNumberB(9);
		result=oper.getResult();
		System.out.println("结果为："+result.toString());
	}

}
