package cn.designPattern.action.chainOfResponsibility;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Handler ha = new HandlerConcreteA();
		Handler hb = new HandlerConcreteB();
		Handler hc = new HandlerConcreteC();
		ha.setSuccesor(hb);
		hb.setSuccesor(hc);

		Integer[] requsets = { 2, 35, 10, 18, 3, 27 };
		for (Integer request : requsets) {
			System.out.println("请求级别:" + Integer.toString(request));
			ha.HandleRequest(request);
		}

	}

}
