package cn.designPattern.action.strategy;

public class Context {
	private Strategy strategy;

	public Context() {

	};

	public Context(Strategy strategy) {
		this.strategy = strategy;
	};

	public void contextFactory(String strategyType) {
		switch (strategyType) {
		case "A":
			strategy = new StrategyConcreteA();
			break;
		case "B":
			strategy = new StrategyConcreteB();
			break;
		case "C":
			strategy = new StrategyConcreteC();
			break;
		default:
			break;
		}
	}

	public void contextInterface() {
		System.out.println("使用的策略为：");
		strategy.algorithInterface();
	}
}
