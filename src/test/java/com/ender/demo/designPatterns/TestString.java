/**
 * @Project: Design-Patterns
 * @Title: TestString.java
 * @Package com.ender.demo.designPatterns
 * @Description: TODO
 * Copyright: Copyright (c) 2010 
 * Company:ENDER.crop
 * 
 * @author ender
 * @date 2014-3-4 上午12:12:24
 * @version V1.0.0
 */
package com.ender.demo.designPatterns;

/**
 * @ClassName: TestString
 * @Description: TODO
 * @author ender
 * @date 2014-3-4 上午12:12:24
 *
 */
public class TestString {

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
		TestNewString tns1 = new TestNewString();
		TestNewString tns2 = new TestNewString();
		
		System.out.println("tns1==tns2 : "+(tns1==tns2));
		System.out.println("tns1.equals(tns2) : "+(tns1.equals(tns2)));
		
		System.out.println("tns1.getStr()==tns2.getStr() : "+(tns1.getStr()==tns2.getStr()));
		System.out.println("tns1.getStr().equals(tns2.getStr()) : "+(tns1.getStr().equals(tns2.getStr())));
		
		
//		System.out.println("tns1.str==tns2.str : "+(tns1.str==tns2.str));
	}

}
