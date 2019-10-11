package cn.designPattern.create.prototype;

public class Prototype implements Cloneable{
	private String name;
	private String age;
	private String year;
	private Details details;
	public Prototype(String name) {
		this.name = name;
		this.details=new Details();
	}
	public Prototype(Details details) throws CloneNotSupportedException {
		this.details=details.clone();
		
	}
	public Object cloneQ() throws CloneNotSupportedException {
		return super.clone();
	}
	public Object cloneS() throws CloneNotSupportedException {
		Prototype obj =new Prototype(this.details);
		obj.name=name;
		obj.age=age;
		obj.year=year;
		return obj;
	}
	public void display() {
		System.out.println("----------------");
		System.out.println(name+" "+age+" "+year);
		System.out.println("detailsA:"+details.getDetailA());
		System.out.println("detailsB:"+details.getDetailB());
	}
	public void setInfo(String age,String year) {
		this.age=age;
		this.year=year;
	}
	public void setDetails(String detailA,String detailB) {
		details.setDetailA(detailA);
		details.setDetailB(detailB);
	}

}
