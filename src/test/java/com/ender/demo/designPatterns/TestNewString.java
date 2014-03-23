/**
 * @Project: Design-Patterns
 * @Title: TestNewString.java
 * @Package com.ender.demo.designPatterns
 * @Description: TODO
 * Copyright: Copyright (c) 2010 
 * Company:ENDER.crop
 * 
 * @author ender
 * @date 2014-3-4 上午12:06:26
 * @version V1.0.0
 */
package com.ender.demo.designPatterns;

/**
 * @ClassName: TestNewString
 * @Description: TODO
 * @author ender
 * @date 2014-3-4 上午12:06:26
 *
 */
//jdk 编译器对于赋值的一些规则测试
public class TestNewString {
	private String str = "ender";  //使用这种初始化构造方法的话 tns1.getStr()==tns2.getStr() : true  并且  tns1.getStr().equals(tns2.getStr()) : true
//	private String str = new String(); //使用这种初始化构造方法的话 tns1.getStr()==tns2.getStr() : false  并且  tns1.getStr().equals(tns2.getStr()) : true

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
		TestNewString tns1 = new TestNewString();
		TestNewString tns2 = new TestNewString();
		
//		tns1.setStr("tns");  //使用这种方式set进去的值如果是一样的则 tns1.getStr()==tns2.getStr() : true
//		tns2.setStr("tns");
		
		tns1.setStr(new String("tns")); //使用这种方式set进去的值如果是一样的则 tns1.getStr()==tns2.getStr() : false
		tns2.setStr(new String("tns"));
		
		System.out.println("tns1==tns2 : "+(tns1==tns2));
		System.out.println("tns1.equals(tns2) : "+(tns1.equals(tns2)));
		
		System.out.println("tns1.getStr()==tns2.getStr() : "+(tns1.getStr()==tns2.getStr()));
		System.out.println("tns1.getStr().equals(tns2.getStr()) : "+(tns1.getStr().equals(tns2.getStr())));
		
		
		System.out.println("tns1.str==tns2.str : "+(tns1.str==tns2.str));
	}

}
