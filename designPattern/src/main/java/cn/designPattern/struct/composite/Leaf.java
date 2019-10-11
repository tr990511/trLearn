package cn.designPattern.struct.composite;

public class Leaf extends Component {

	public Leaf(String name) {
		super(name);
	}

	@Override
	public void add(Component c) {
		System.out.println("不能添加叶子");
	}

	@Override
	public void remove(Component c) {
		System.out.println("不能移除叶子");
	}

	@Override
	public void display(Integer depth) {
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<depth;i++)sb.append("-");
		System.out.println(sb.toString()+name);

	}

}
