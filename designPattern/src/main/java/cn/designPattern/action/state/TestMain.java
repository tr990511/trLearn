/**
 * 状态模式
 */
package cn.designPattern.action.state;

public class TestMain {

	public static void main(String[] args) {
		Context context=new Context();
		context.setHour(9);
		context.doHandle();
		
		context.setHour(17);
		context.setEndFlag(true);
		//context.setEndFlag(false);
		context.doHandle();
		
		context.setHour(21);
		context.doHandle();

	}

}
