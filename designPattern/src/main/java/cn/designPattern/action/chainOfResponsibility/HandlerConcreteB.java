package cn.designPattern.action.chainOfResponsibility;

public class HandlerConcreteB extends Handler {

	@Override
	public void HandleRequest(Integer request) {
		if (request >= 10 && request < 20) {
			System.out.println("在A范围(10-19)，开始处理·······");
			System.out.println("============");
		} else if (succesor != null) {
			System.out.println("超出B权限，向上请示······");
			succesor.HandleRequest(request);
		}
	}

}
