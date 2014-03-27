/**
 * @Project: Design-Patterns
 * @Title: ShoppingLoginServiceAdapter.java
 * @Package com.ender.demo.designPatterns.adapter
 * @Description: TODO
 * Copyright: Copyright (c) 2010 
 * Company:ENDER.crop
 * 
 * @author ender
 * @date 2014-3-2 下午10:01:50
 * @version V1.0.0
 */
package com.ender.demo.designPatterns.adapter;

/**
 * @ClassName: ShoppingLoginServiceAdapter
 * @Description: TODO
 * @author ender
 * @date 2014-3-2 下午10:01:50
 *
 */
public class ShoppingLoginServiceAdapterImpl extends ShoppingLoginServiceImpl 
	implements ShoppingLoginServiceAdapter{
	
	@Override
	public boolean login(String username,String password){
		Long timestamp = System.currentTimeMillis();
		return log_in(username,password,timestamp);
	}
	
	public boolean login(){
		return log_in();
	}

	/*
	  * <p>Title: log_in</p>
	  * <p>Description: </p>
	  * @param username
	  * @param password
	  * @param timestamp
	  * @return
	  * @see com.ender.demo.designPatterns.adapter.ShoppingLoginServiceAdapter#log_in(java.lang.String, java.lang.String, java.lang.Long)
	  */
	public boolean log_in(String username, String password, Long timestamp) {
		System.out.println("log_in method executed with username="+username+" password="+password+" timestamp="+timestamp);
		return false;
	}

	/*
	  * <p>Title: log_in</p>
	  * <p>Description: </p>
	  * @return
	  * @see com.ender.demo.designPatterns.adapter.ShoppingLoginServiceAdapter#log_in()
	  */
	public boolean log_in() {
		Long timestamp = System.currentTimeMillis();
		return this.log_in(this.getUser().getUsername(), this.getUser().getPassword(), timestamp);
	}

}
