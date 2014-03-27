/**
 * 
 */
package com.ender.demo.designPatterns.factory;

/**
 * @author ender
 *
 */
public class TankWorker implements Worker {

	/* (non-Javadoc)
	 * @see com.ender.demo.designPatterns.factory.Worker#produce()
	 */
	public void produce() {
		// TODO Auto-generated method stub
		System.out.println("produced a new Tank");
	}

	/* (non-Javadoc)
	 * @see com.ender.demo.designPatterns.factory.Worker#fix()
	 */
	public void fix() {
		// TODO Auto-generated method stub
		System.out.println("fixed a Tank");
	}

}
