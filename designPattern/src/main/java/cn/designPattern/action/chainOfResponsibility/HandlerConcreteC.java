package cn.designPattern.action.chainOfResponsibility;

public class HandlerConcreteC extends Handler {

	@Override
	public void HandleRequest(Integer request) {
		if (request >= 20 && request < 30) {
			System.out.println("在C范围(20-29)，开始处理·······");
			System.out.println("============");
		} else {
			System.out.println("超出C权限，不予答复······");
			System.out.println("============");
		}
	}

}
