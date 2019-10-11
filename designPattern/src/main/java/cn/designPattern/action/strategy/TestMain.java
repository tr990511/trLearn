/**
 * 策略模式
 */
package cn.designPattern.action.strategy;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context context=new Context();
		context.contextFactory("A");
		context.contextInterface();
	}

}
