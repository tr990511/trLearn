package cn.designPattern.action.visitor;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {
	private List<Person> elements = new ArrayList<Person>();

	public void attach(Person element) {
		elements.add(element);
	}

	public void detach(Person element) {
		elements.remove(element);
	}

	public void display(Action visitor) {
		for (Person person : elements) {
			person.accept(visitor);
		}
	}
}
