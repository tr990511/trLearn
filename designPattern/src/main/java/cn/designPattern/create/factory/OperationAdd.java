package cn.designPattern.create.factory;

public class OperationAdd extends Operation {
	public double getResult() {
		double result = 0.0;
		result=getNumberA() +getNumberB();
		return result;
		
	}
}
