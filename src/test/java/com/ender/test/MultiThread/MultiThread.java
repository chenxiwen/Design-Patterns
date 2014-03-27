/**
 * @Project: Design-Patterns
 * @Title: MultiThread.java
 * @Package com.ender.demo.designPatterns
 * @Description: TODO
 * Copyright: Copyright (c) 2010 
 * Company:ENDER.crop
 * 
 * @author ender
 * @date 2014-3-3 下午11:03:15
 * @version V1.0.0
 */
package com.ender.test.MultiThread;

/**
 * @ClassName: MultiThread
 * @Description: TODO
 * @author ender
 * @date 2014-3-3 下午11:03:15
 *
 */
public class MultiThread implements Runnable{
//	private String str = "ender";
	private String str = new String();
	
	/**
	 * @return the str
	 */
	public String getStr() {
		return str;
	}

	/**
	 * @param str the str to set
	 */
	public void setStr(String str) {
		this.str = str;
	}

	/**
	
	 * main(这里用一句话描述这个方法的作用)
	 * @author ender
	 * @Title: main
	 * @Description: TODO
	 * @param @param args    设定文件
	 * @return void    返回类型
	 * @throws
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Thread t1 = new Thread(new MultiThread(), "t1");
//		Thread t2 = new Thread(new MultiThread(), "t2");
//		t1.start();
//		t2.start(); //这个时候post方法可以非阻塞的运行，因为post方法上的synchornized关键字只对这个对象中的方法有效 t1，t2是两个独立的对象
		
//		MultiThread mt = new MultiThread();
//		Thread t3 = new Thread(mt, "t3");
//		Thread t4 = new Thread(mt, "t4");
//		t3.start();
//		t4.start();//这个时候post方法以阻塞的方式运行，因为这个时候t3和t4两个线程都访问的是mt这个对象
		
		MultiThread mt1 = new MultiThread();
		MultiThread mt2 = new MultiThread();
//		System.out.println("is equals before set value == :"+(mt1.getStr()==mt2.getStr()));
//		System.out.println("is equals before set value equals :"+(mt1.getStr().equals(mt2.getStr())));
//		mt1.setStr("mt1");
//		mt2.setStr("mt2");
//		System.out.println("is equals after set value:"+(mt1.getStr()==mt2.getStr()));
//		System.out.println("is equals after set value equals :"+(mt1.getStr().equals(mt2.getStr())));
		Thread t5 = new Thread(mt1,"t5");
		Thread t6 = new Thread(mt2,"t6");
		t5.start();
		t6.start();
		
	}

	/*
	  * <p>Title: run</p>
	  * <p>Description: </p>
	  * @see java.lang.Runnable#run()
	  */
	public void run() {
		// TODO Auto-generated method stub
		try {
//			post();
			block();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public synchronized void post() throws InterruptedException{
		System.out.println("nowStrat -- "+Thread.currentThread().getName()+" -- "+System.currentTimeMillis());
		Thread.sleep(3000);
		System.out.println("nowEnd -- "+Thread.currentThread().getName()+" -- "+System.currentTimeMillis());
	}
	
	public void block() throws InterruptedException{
		System.out.println(this);//this 是不一样的  因为每个this都是一个对象的引用
		System.out.println(MultiThread.class);//MultiThread是一样的，因为代表这个对象的类型 并不是实例
		System.out.println(getStr());//这个要具体看getStr()返回的值，如果是== 或者 equals 为true的话  就能锁得住否则不行
		synchronized(this.getStr()){
			System.out.println("blockStart** -- "+Thread.currentThread().getName()+" -- "+System.currentTimeMillis());
			for(int i=0;i<3;i++){
				System.out.println(i+1);
				Thread.sleep(1000);
			}
			System.out.println("blockEnd** -- "+Thread.currentThread().getName()+" -- "+System.currentTimeMillis());
		}
	}

}
