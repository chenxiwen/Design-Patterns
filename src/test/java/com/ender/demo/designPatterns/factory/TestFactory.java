package com.ender.demo.designPatterns.factory;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author ender
 *
 */
public class TestFactory {
	@Before
	public void echoBegin(){
		System.out.println(this.getClass().getName()+" just test cases begin...");
	}
	
	@After
	public void echoEnd(){
		System.out.println(this.getClass().getName()+" just test cases end...");
	}
	@Test
	public void testFactory(){
		Worker worker1 = WorkerFactory.getWorkder(WorkerFactory.PHONE);
		Worker worker2 = WorkerFactory.getWorkder(WorkerFactory.TANK);
		worker1.produce();
		worker2.produce();
		worker1.fix();
		worker2.fix();
	}

}
