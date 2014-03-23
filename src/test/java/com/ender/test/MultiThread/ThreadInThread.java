/**
 * @Project: Design-Patterns
 * @Title: ThreadInThread.java
 * @Package com.ender.test.MultiThread
 * @Description: TODO
 * Copyright: Copyright (c) 2010 
 * Company:ENDER.crop
 * 
 * @author ender
 * @date 2014-3-5 下午4:08:37
 * @version V1.0.0
 */
package com.ender.test.MultiThread;

/**
 * @ClassName: ThreadInThread
 * @Description: TODO
 * @author ender
 * @date 2014-3-5 下午4:08:37
 *
 */
public class ThreadInThread extends Thread{

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
		Thread tit = new ThreadInThread();
		tit.setName("tit");
		tit.start();
	}

	/*
	  * <p>Title: run</p>
	  * <p>Description: </p>
	  * @see java.lang.Thread#run()
	  */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i=0;
		while(i<5){
			System.out.println(this.currentThread().getName()+"-->run-->"+i+"--State:"+this.getState());
			try {
				this.sleep(1000);
				Thread it = new Thread(new InnerThread(),"InnerThread"+i);
				it.start();
//				it.join();
				i++;
//				if(i==3){
//					this.wait();
//				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				
			}
		}
	}
	
	

}

class InnerThread implements Runnable{

	/*
	  * <p>Title: run</p>
	  * <p>Description: </p>
	  * @see java.lang.Runnable#run()
	  */
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++){
			System.out.println(Thread.currentThread().getName()+" "+i);
			try {
				Thread.sleep(300);
//				if(i==3){
//					Thread.currentThread().wait();
//				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println(Thread.currentThread().getName()+" -->State: "+Thread.currentThread().getState());
//				Thread.currentThread().interrupt();
			}finally{
				
			}
		}
	}
	
}
