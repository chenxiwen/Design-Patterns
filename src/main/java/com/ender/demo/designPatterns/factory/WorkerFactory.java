/**
 * 
 */
package com.ender.demo.designPatterns.factory;

/**
 * @author ender
 *  工厂模式通常用于大量创建一系列拥有一些共性的对象时使用，而且通常不需要实例化工厂本身
 *  直接使用工厂一共的静态方法快速的产生自己需要的对象实例
 */
public class WorkerFactory {
	public static final String PHONE="phone";
	public static final String TANK="tank";
	
	public static Worker getWorkder(String type){
		if(WorkerFactory.PHONE.equals(type)){
			return new PhoneWorker();
		}else if(WorkerFactory.TANK.equals(type)){
			return new TankWorker();
		}else{
			System.out.println("there is no "+type+" worker here!");
			return null;
		}
	}
}
