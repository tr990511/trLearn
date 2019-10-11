package cn.designPattern.action.chainOfResponsibility;

public class HandlerConcreteA extends Handler {

	@Override
	public void HandleRequest(Integer request) {
		if (request >= 0 && request < 10) {
			System.out.println("在A范围(0-9)，开始处理·······");
			System.out.println("============");
		} else if (succesor != null) {
			System.out.println("超出A权限，向上请示······");
			succesor.HandleRequest(request);
		}
	}

}
