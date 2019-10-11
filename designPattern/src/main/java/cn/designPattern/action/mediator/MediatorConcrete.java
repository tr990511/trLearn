package cn.designPattern.action.mediator;

public class MediatorConcrete extends Mediator {
	private ColleagueConcreteA colleagueA; 
	private ColleagueConcreteB colleagueB; 
	
	public void setColleagueA(ColleagueConcreteA colleagueA) {
		this.colleagueA = colleagueA;
	}

	public void setColleagueB(ColleagueConcreteB colleagueB) {
		this.colleagueB = colleagueB;
	}


	@Override
	public void send(String message, Colleague colleague) {
		// TODO Auto-generated method stub
		if(colleague==colleagueA) {
			colleagueB.notify(message);
		}else {
			colleagueA.notify(message);
		}
	}

}
