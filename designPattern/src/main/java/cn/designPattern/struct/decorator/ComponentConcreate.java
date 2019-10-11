package cn.designPattern.struct.decorator;

public class ComponentConcreate extends Component {

	@Override
	public void operation() {
		System.out.println("未被装饰的实体");
	}

}
