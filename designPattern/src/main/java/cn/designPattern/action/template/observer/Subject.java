package cn.designPattern.action.template.observer;
//通知内容，主题

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	private List<Observer> observers=new ArrayList<Observer>();
	public void attachObserver(Observer observer) {
		observers.add(observer);
	}
	public void detachObserver(Observer observer) {
		observers.remove(observer);
	}
	public void notifyObserver() {
		for (Observer observer : observers) {
			observer.update();
		}
	}
}
