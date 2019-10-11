package cn.designPattern.action.template.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate extends Aggregate {
	private List<Object> items=new ArrayList<Object>();
	@Override
	public Iterator createIterator() {
		return new ConcreteIterator(this);
	}
	public Integer getCount() {
		return items.size();
	};
	public Object getCurrent(int index) {
		return items.get(index);
	};
	public Object getCurrent(int index,Object object) {
		return items.add(index, object);
	};
}
