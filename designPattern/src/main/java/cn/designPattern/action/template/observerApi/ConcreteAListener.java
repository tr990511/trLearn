package cn.designPattern.action.template.observerApi;

import java.util.Date;

public class ConcreteAListener {
	public void stopWatchingTV(Date date) {
		System.out.println("--stopWatchingTV--");
	}
}
