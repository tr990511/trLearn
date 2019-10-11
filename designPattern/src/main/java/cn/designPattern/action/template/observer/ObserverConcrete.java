package cn.designPattern.action.template.observer;

public class ObserverConcrete extends Observer {
	private String name;
	private String observerState;
	private SubjectConcrete subject;

	public ObserverConcrete(SubjectConcrete subject,String name) {
		this.subject = subject;
		this.name = name;
	}

	@Override
	public void update() {
		observerState = subject.getSubjectState();
		System.out.println("观察者" + name + "最新状态是" + observerState);

	}

	public SubjectConcrete getSubject() {
		return subject;
	}

	public void setSubject(SubjectConcrete subject) {
		this.subject = subject;
	}

}
