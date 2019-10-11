package cn.designPattern.create.prototype;

public class Details implements Cloneable {
	private String detailA;
	private String detailB;
	
	public Details clone() throws CloneNotSupportedException {
		return (Details) super.clone();
	}
	public String getDetailA() {
		return detailA;
	}
	public void setDetailA(String detailA) {
		this.detailA = detailA;
	}
	public String getDetailB() {
		return detailB;
	}
	public void setDetailB(String detailB) {
		this.detailB = detailB;
	}
	
}
