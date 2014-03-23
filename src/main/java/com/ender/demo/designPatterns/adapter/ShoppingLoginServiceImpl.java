/**
 * @Project: Design-Patterns
 * @Title: ShoppingLoginServiceImpl.java
 * @Package com.ender.demo.designPatterns.adapter
 * @Description: TODO
 * Copyright: Copyright (c) 2010 
 * Company:ENDER.crop
 * 
 * @author ender
 * @date 2014-3-2 下午9:12:08
 * @version V1.0.0
 */
package com.ender.demo.designPatterns.adapter;

/**
 * @ClassName: ShoppingLoginServiceImpl
 * @Description: TODO
 * @author ender
 * @date 2014-3-2 下午9:12:08
 *
 */
public class ShoppingLoginServiceImpl implements IShoppingLoginService{
	private User user;
	/*
	  * <p>Title: login</p>
	  * <p>Description: </p>
	  * @param username
	  * @param passwordMd5
	  * @return
	  * @see com.ender.demo.designPatterns.adapter.IShoppingLoginService#login(java.lang.String, java.lang.String)
	  */
	public boolean login(String username, String passwordMd5) {
		System.out.println("Login Method Executed Using Username="+user.getUsername()+" Password="+Md5Util.getMd5Str(user.getPassword()));
		return false;
	}
	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}
	/*
	  * <p>Title: login</p>
	  * <p>Description: </p>
	  * @return
	  * @see com.ender.demo.designPatterns.adapter.IShoppingLoginService#login()
	  */
	public boolean login() {
		if(this.getUser()!=null&&this.getUser().getUsername()!=null&&this.getUser().getPassword()!=null){
			System.out.println("Login Method Executed Using Username="+user.getUsername()+" Password="+Md5Util.getMd5Str(user.getPassword()));
			return true;
		}else{
			System.out.println("Login Method Executed But User is Null...");
			return false;
		}
	}

}
