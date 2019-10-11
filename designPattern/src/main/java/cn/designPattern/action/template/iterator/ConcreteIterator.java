package cn.designPattern.action.template.iterator;

public class ConcreteIterator extends Iterator {
	private ConcreteAggregate aggregate;
	private int current =0;
	public ConcreteIterator(ConcreteAggregate aggregate) {
		this.aggregate=aggregate;
	}
	@Override
	public Object first() {
		// TODO Auto-generated method stub
		return aggregate[0];
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		Object ret =null;
		current++;
		if (current<aggregate.size()) {
			ret=aggregate[current];
		}
		return ret;
	}

	@Override
	public Boolean isDone() {
		// TODO Auto-generated method stub
		return current>=aggregate.getCount() ? true : false;
	}

	@Override
	public Object currentItem() {
		return aggregate[current];
	}

}
