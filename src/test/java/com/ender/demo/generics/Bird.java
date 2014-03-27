package com.ender.demo.generics;

public abstract class Bird extends Animal implements Soundable{
	
	public String color;

	public String getColor() {
		return color;
	}

	public abstract void setColor(String color);

}
