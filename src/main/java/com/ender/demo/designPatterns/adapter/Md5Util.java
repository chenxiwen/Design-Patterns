/**
 * @Project: Design-Patterns
 * @Title: Md5Util.java
 * @Package com.ender.demo.designPatterns.adapter
 * @Description: TODO
 * Copyright: Copyright (c) 2010 
 * Company:ENDER.crop
 * 
 * @author ender
 * @date 2014-3-2 下午9:17:41
 * @version V1.0.0
 */
package com.ender.demo.designPatterns.adapter;

/**
 * @ClassName: Md5Util
 * @Description: TODO
 * @author ender
 * @date 2014-3-2 下午9:17:41
 *
 */
public class Md5Util {
	
	public static String getMd5Str(String password){
		System.out.println("turn "+password+" to Md5 String");
		return password;
	}
}
