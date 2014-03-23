/**
 * @Project: Design-Patterns
 * @Title: Sort.java
 * @Package com.ender.demo.designPatterns
 * @Description: TODO
 * Copyright: Copyright (c) 2010 
 * Company:ENDER.crop
 * 
 * @author ender
 * @date 2014-3-5 下午6:27:16
 * @version V1.0.0
 */
package com.ender.demo.designPatterns;

import java.util.Arrays;

/**
 * @ClassName: Sort
 * @Description: TODO
 * @author ender
 * @date 2014-3-5 下午6:27:16
 *
 */
public class Sort {

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
		int[] arr = {5,3,9,0,2,7,1,8,6};
//		arr = bubble(arr); 
//		arr = jdkSort(arr);
//		arr = choose(arr);
		arr = insert(arr);
		
		for(int i:arr){
			System.out.println(i);
		}
	}
	
	public static int[] bubble(int[] arr){
		long t = System.currentTimeMillis();
		int tmp;
		for(int i=0;i<arr.length;i++){
			for(int j=i;j<arr.length;j++){
				if(arr[j]<arr[i]){
					tmp = arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
		System.out.println(System.currentTimeMillis()-t);
		return arr;
	}
	
	public static int[] jdkSort(int[] arr){
		long t = System.currentTimeMillis();
		Arrays.sort(arr);
		System.out.println(System.currentTimeMillis()-t);
		return arr;
	}
	
	public static int[] choose(int[] arr){
		long t = System.currentTimeMillis();
		int min,tmp;
		for(int i=0;i<arr.length;i++){
			min=i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[min]>arr[j]){
					min=j;
				}
//				min=min>arr[j]?min:arr[j];
			}
			tmp=arr[i];
			arr[i]=arr[min];
			arr[min]=tmp;
		}
		System.out.println("time:"+(System.currentTimeMillis()-t));
		return arr;
		
	}
	
	public static int[] insert(int[] arr){
		long t = System.currentTimeMillis();
		int tmp;
		for(int i=1;i<arr.length;i++){
			tmp = arr[i];
			for(int j=i-1;j>=0&&tmp<arr[j];j--){
				arr[j+1]=arr[j];
				arr[j]=tmp;
			}
		}
		System.out.println("time:"+(System.currentTimeMillis()-t));
		return arr;
	}
	
//	public static int[] quick(int[] arr){
//		
//	}

}
