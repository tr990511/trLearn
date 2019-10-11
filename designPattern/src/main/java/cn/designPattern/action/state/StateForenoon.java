package cn.designPattern.action.state;

public class StateForenoon extends State {

	@Override
	public void handle(Context context) {
		if(context.getHour()<12) {
			System.out.print("当前时间："+context.getHour().toString());
			System.out.println("。上午工作。");
		}else {
			context.setStateCurrent(new StateAfternoon());
			context.doHandle();
		}

	}

}
