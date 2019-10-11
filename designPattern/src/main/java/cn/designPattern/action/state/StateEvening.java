package cn.designPattern.action.state;

public class StateEvening extends State {

	@Override
	public void handle(Context context) {
		if(context.getEndFlag()) {
			context.setStateCurrent(new StateRest());
			context.doHandle();
		}else {
			if(context.getHour()<21) {
				System.out.print("当前时间："+context.getHour().toString());
				System.out.println("。加班工作，疲劳中。");
				
			}else {
				context.setStateCurrent(new StateSleeping());
				context.doHandle();
			}
		}

	}

}
