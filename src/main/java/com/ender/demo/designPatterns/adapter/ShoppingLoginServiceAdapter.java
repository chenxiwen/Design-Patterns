/**
 * @Project: Design-Patterns
 * @Title: ShoppingLoginServiceAdapter.java
 * @Package com.ender.demo.designPatterns.adapter
 * @Description: TODO
 * Copyright: Copyright (c) 2010 
 * Company:ENDER.crop
 * 
 * @author ender
 * @date 2014-3-2 下午10:03:31
 * @version V1.0.0
 */
package com.ender.demo.designPatterns.adapter;

/**
 * @ClassName: ShoppingLoginServiceAdapter
 * @Description: TODO
 * @author ender
 * @date 2014-3-2 下午10:03:31
 *
 */
public interface ShoppingLoginServiceAdapter {
	public boolean log_in(String username,String password,Long timestamp);
	public boolean log_in();
}
