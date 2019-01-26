package com.test;

public class musician {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public musician(String name) {
		super();
		this.name = name;
	}
	
	musician playInstrument = new musician("play");
	
	

}
