/**
 * @Project: Design-Patterns
 * @Title: ShoppingLogin.java
 * @Package com.ender.demo.designPatterns.adapter
 * @Description: TODO
 * Copyright: Copyright (c) 2010 
 * Company:ENDER.crop
 * 
 * @author ender
 * @date 2014-3-2 下午9:06:00
 * @version V1.0.0
 */
package com.ender.demo.designPatterns.adapter;

/**
 * @ClassName: ShoppingLogin
 * @Description: TODO
 * @author ender
 * @date 2014-3-2 下午9:06:00
 * 
 */

//requirement:现有平台要实现一个自动登陆的功能登陆京东、淘宝、一号店，商定好了一个接口public boolean login(String username,String passwordMd5)
//突然有个新的商城也要加入平台的自动登陆列表，假定为凡客，但是他们提供的登陆接口名字叫log_in(String username,String password,Long timestamp)

//ShoppingLoginServiceAdapter是适配器接口，ShoppingLoginServiceAdapterImpl是适配器实现
//最终ShoppingLoginServiceAdapterImpl会可以转换成标准的IShoppingLoginService并调用标准的login()接口方法实现登陆

public interface IShoppingLoginService {
	public boolean login(String username, String passwordMd5);
	public boolean login();
}
