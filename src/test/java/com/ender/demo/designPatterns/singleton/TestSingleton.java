/**
 * 
 */
package com.ender.demo.designPatterns.singleton;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author ender
 *
 */
public class TestSingleton {
	@Before
	public void echoBegin(){
		System.out.println(this.getClass().getName()+" just test cases begin...");
	}
	
	@After
	public void echoEnd(){
		System.out.println(this.getClass().getName()+" just test cases end...");
	}
	
	@Test
	public void testSingleton(){
//		SingletonClass singletonClass = new SingletonClass();// this will failed because the constructor of SingletonClass can not be reached
		SingletonClass singletonClass = SingletonClass.getInstance();// this is the only way to get an instance of SingletonClass
		singletonClass.setField("hello world !");
		System.out.println(singletonClass.getField());
		singletonClass.method();
		singletonClass.publicMethod();
		singletonClass.protectedMethod();
//		singletonClass.privateMethod();//the privateMethod is declared as a private method so we cannot invoke it here, but only in the SingletonClass
	}
	
	@Test
	public void testSingletonLiftCycle(){
		SingletonClass singletonClass = SingletonClass.getInstance();
		singletonClass.method();
		
		SingletonClass singletonClass1 = SingletonClass.getInstance();
		singletonClass1.publicMethod();
		
		System.out.println(singletonClass==singletonClass1);
		Assert.assertEquals(singletonClass, singletonClass1);
	}
}
