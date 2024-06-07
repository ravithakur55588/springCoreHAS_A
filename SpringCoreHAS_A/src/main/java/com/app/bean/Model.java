package com.app.bean;

public class Model {
	private int mod;

	public int getMod() {
		return mod;
	}

	public void setMod(int mod) {
		this.mod = mod;
	}

	public Model() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Model(int mod) {
		super();
		this.mod = mod;
	}

	@Override
	public String toString() {
		return "Model [mod=" + mod + "]";
	}
	
	
}
