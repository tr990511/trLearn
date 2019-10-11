package cn.designPattern.action.state;

public class StateAfternoon extends State {

	@Override
	public void handle(Context context) {
		if(context.getHour()<17) {
			System.out.print("当前时间："+context.getHour().toString());
			System.out.println("。下午工作。");
		}else {
			context.setStateCurrent(new StateEvening());
			context.doHandle();
		}

	}

}
