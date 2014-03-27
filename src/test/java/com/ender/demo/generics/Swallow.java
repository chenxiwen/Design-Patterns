package com.ender.demo.generics;

public class Swallow extends Bird implements Flyable {

	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("a swallow is flying...");
	}

	@Override
	public void setColor(String color) {
		// TODO Auto-generated method stub
		this.color ="swallow:" +color;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = "swallow"+name;
	}

	@Override
	public void breath() {
		// TODO Auto-generated method stub
		System.out.println("a swallow is breathing...");
	}

	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("a swallow is singing...");
	}

}
