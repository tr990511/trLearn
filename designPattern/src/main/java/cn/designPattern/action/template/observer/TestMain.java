package cn.designPattern.action.template.observer;

public class TestMain {

	public static void main(String[] args) {
		SubjectConcrete csA=new SubjectConcrete();
		csA.attachObserver(new ObserverConcrete(csA,"X"));
		csA.attachObserver(new ObserverConcrete(csA,"Y"));
		csA.attachObserver(new ObserverConcrete(csA,"Z"));
		csA.setSubjectState("ABC");
		csA.notifyObserver();
	}

}
