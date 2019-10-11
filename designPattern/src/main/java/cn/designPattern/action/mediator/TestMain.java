package cn.designPattern.action.mediator;

public class TestMain {

	public static void main(String[] args) {
		MediatorConcrete m=new MediatorConcrete();
		ColleagueConcreteA cA=new ColleagueConcreteA(m);
		ColleagueConcreteB cB=new ColleagueConcreteB(m);
		
		m.setColleagueA(cA);
		m.setColleagueB(cB);
		cA.send("cA发消息");
		cB.send("cB发消息");
	}

}
