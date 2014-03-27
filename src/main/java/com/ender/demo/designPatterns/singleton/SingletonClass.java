/**
 * 
 */
package com.ender.demo.designPatterns.singleton;

/**
 * @author ender
 * 单例，就是在一个jvm中同时不可以有多个单例类的实例出现。
 */
public class SingletonClass {
	private static SingletonClass singletonClass; //declare a field of SingletonClass in private and static
	
	private String field;
	
	private SingletonClass(){
		//make the default constructor private
		System.out.println("private constructor invoked");
	}
	
	public static SingletonClass getInstance(){ // provide a method of public and static to be the only way of getting the instance of this class
		if(singletonClass == null){
			singletonClass=new SingletonClass();
		}
		return singletonClass;
	}
	
	public static synchronized SingletonClass getInstance1(){ // keep this work safe in multithreads 这里其实相当于锁的是这个方法的返回值，也就是类本身，性能会有些问题
		if(singletonClass == null){
			singletonClass=new SingletonClass();
		}
		return singletonClass;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}
	
	private void privateMethod(){
		System.out.println("this is a private method in SingletonClass");
	}
	
	protected void protectedMethod(){
		System.out.println("this is a protected method in SingletonClass");
	}
	
	public  void publicMethod(){
		System.out.println("this is a public method in SingletonClass");
	}
	
	void method(){
		System.out.println("this is a default(frendly) method in SingletonClass");
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("done life cycle...");
		super.finalize();
	}

}
