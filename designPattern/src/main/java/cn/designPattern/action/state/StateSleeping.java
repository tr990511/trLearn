package cn.designPattern.action.state;

public class StateSleeping extends State {

	@Override
	public void handle(Context context) {
		System.out.print("当前时间："+context.getHour().toString());
		System.out.println("。顶不住了，休息睡觉。");
	}

}
