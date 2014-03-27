package com.ender.demo.generics;

public abstract class Animal {
	public String name;
	public int age;
	
	public abstract void breath();
	
	public String getName(){
		return name;
	}
	
	public abstract void setName(String name);

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
