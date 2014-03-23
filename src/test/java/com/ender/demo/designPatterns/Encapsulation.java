/**
 * @Project: Design-Patterns
 * @Title: Encapsulation.java
 * @Package com.ender.demo.designPatterns
 * @Description: TODO
 * Copyright: Copyright (c) 2010 
 * Company:ENDER.crop
 * 
 * @author ender
 * @date 2014-3-5 下午5:52:41
 * @version V1.0.0
 */
package com.ender.demo.designPatterns;

class Encapsulation{
	
	class ClassValue{
		public int i = 15;
	}
	
	public static void main(String[] args){
		Encapsulation e = new Encapsulation();
		e.first();
		
		A a = new B();
		a.show();
		System.out.println(a instanceof B?"true":"false");
		a.showA();
		
		try {
			System.out.println("begin ");
		
			System.out.println("end ");
			return;
			}catch (Exception ex) {
				System.out.println("excepton ");
			} finally {
				System.out.println("finally");
			}
	}
	
	public void first(){
		ClassValue cv = new ClassValue();
		second(cv);
		System.out.println("cv.i="+cv.i);
	}
	
	public void second(ClassValue v){
		ClassValue cv = new ClassValue();
		cv.i=25;
		v=cv;
		System.out.println("v.i="+v.i);
	}
		
}

class A{
	public void show(){
		System.out.println("a");
	}
	
	public void showA(){
		System.out.println("aA");
	}
}

class B extends A{
	public void show(){
		System.out.println("b");
	}
	
	public void showA(){
		System.out.println("AB");
	}
}