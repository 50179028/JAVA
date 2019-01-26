package com.test;

public class Instrument extends musician{
	public Instrument(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	private String name;
	public String sound[];
	
	public void playSound() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getSound() {
		return sound;
	}

	public void setSound(String[] sound) {
		this.sound = sound;
	}
	
	

}
