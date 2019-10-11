package cn.designPattern.action.state;

public class StateRest extends State {

	@Override
	public void handle(Context context) {
		System.out.print("当前时间："+context.getHour().toString());
		System.out.println("。完成工作下班回家。");
	}

}
