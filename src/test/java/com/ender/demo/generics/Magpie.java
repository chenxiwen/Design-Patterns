package com.ender.demo.generics;

public class Magpie extends Bird implements Flyable {

	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("a magpie is flying...");
	}

	@Override
	public void setColor(String color) {
		// TODO Auto-generated method stub
		this.color="Magpie:"+color;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name="Magpie:"+name;
	}

	@Override
	public void breath() {
		// TODO Auto-generated method stub
		System.out.println("a magpie is breathing...");
	}

	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("a magpie is singing...");
	}

}
