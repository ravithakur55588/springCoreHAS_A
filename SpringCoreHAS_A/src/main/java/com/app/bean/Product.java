package com.app.bean;

public class Product {
	private int pid;
	
	private Model md;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public Model getMd() {
		return md;
	}

	public void setMd(Model md) {
		this.md = md;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int pid, Model md) {
		super();
		this.pid = pid;
		this.md = md;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", md=" + md + "]";
	}
	
	
}
