package org.rk;

public class Samsung extends Phone{

	private String mode;
	
	public Samsung(String model) {
		super(model);
	}

	public String getMode() {
		return mode;
	}
	
	public void features() {
		System.out.println("Android Flagship");
	}
}
