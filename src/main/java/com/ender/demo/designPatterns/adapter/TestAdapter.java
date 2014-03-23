/**
 * @Project: Design-Patterns
 * @Title: TestAdapter.java
 * @Package com.ender.demo.designPatterns.adapter
 * @Description: TODO
 * Copyright: Copyright (c) 2010 
 * Company:ENDER.crop
 * 
 * @author ender
 * @date 2014-3-2 下午9:52:44
 * @version V1.0.0
 */
package com.ender.demo.designPatterns.adapter;

/**
 * @ClassName: TestAdapter
 * @Description: TODO
 * @author ender
 * @date 2014-3-2 下午9:52:44
 *
 */
public class TestAdapter {

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
		User user = new User();
		user.setNickName("ender");
		user.setUsername("chenxiwen");
		user.setPassword("123456");
		user.setAge(26);
		user.setAddress("beijing");
		
		IShoppingLoginService shoppingLoginService = new ShoppingLoginServiceImpl();
		
		((ShoppingLoginServiceImpl)shoppingLoginService).setUser(user);
		shoppingLoginService.login();
		
		//or use parameters
		shoppingLoginService.login(user.getUsername(), Md5Util.getMd5Str(user.getPassword()));
		
		ShoppingLoginServiceAdapter shoppingLoginServiceAdapter = new ShoppingLoginServiceAdapterImpl();
		((ShoppingLoginServiceAdapterImpl)shoppingLoginServiceAdapter).setUser(user);
		((IShoppingLoginService)shoppingLoginServiceAdapter).login();
	}

}
