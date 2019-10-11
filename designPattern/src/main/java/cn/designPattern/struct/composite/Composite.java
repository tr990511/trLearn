package cn.designPattern.struct.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
	private List<Component> children =new ArrayList<Component>();
	public Composite(String name) {
		super(name);
	}

	@Override
	public void add(Component c) {
		// TODO Auto-generated method stub
		children.add(c);
	}

	@Override
	public void remove(Component c) {
		// TODO Auto-generated method stub
		children.remove(c);
	}

	@Override
	public void display(Integer depth) {
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<depth;i++)sb.append("-");
		System.out.println(sb.toString()+name);
		for (Component component : children) {
			component.display(depth+2);
		}

	}

}
