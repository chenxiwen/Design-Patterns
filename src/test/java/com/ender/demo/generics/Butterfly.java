package com.ender.demo.generics;

public class Butterfly extends Animal implements Flyable {

	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("a butterfly is flying...");
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = "butterfly:"+name;
	}

	@Override
	public void breath() {
		// TODO Auto-generated method stub
		System.out.println("a butterfly is breathing...");
	}

}
