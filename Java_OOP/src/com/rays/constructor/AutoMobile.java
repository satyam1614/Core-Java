package com.rays.constructor;

public class AutoMobile {
	
	private String Colour;
	private Integer Speed;
	private String Make;

	public AutoMobile (String colour,Integer speed, String make) {
		
		this.Colour = colour;
		this.Speed = speed;
		this.Make = make;
		
	}

	public String getColour() {
		return Colour;
	}

	public Integer getSpeed() {
		return Speed;
	}

	public String getMake() {
		return Make;
	}
}
