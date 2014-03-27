package com.ender.demo.generics;

import java.util.ArrayList;
import java.util.List;

public class TestGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestGenerics tg = new TestGenerics();
		
			Swallow s1 = new Swallow();
			s1.setName("s1");
			s1.setAge(1);
			s1.setColor("yellow");
			Swallow s2 = new Swallow();
			s2.setName("s2");
			s2.setAge(2);
			s2.setColor("blue");
			
			Magpie m1 = new Magpie();
			m1.setName("m1");
			m1.setAge(1);
			m1.setColor("red");
			Magpie m2 = new Magpie();
			m2.setName("m2");
			m2.setAge(2);
			m2.setColor("white");
			
			Butterfly b1 = new Butterfly();
			b1.setName("b1");
			b1.setAge(1);
			Butterfly b2 = new Butterfly();
			b2.setName("b2");
			b2.setAge(2);
			
			List<Animal> animalList = new ArrayList<Animal>();
			animalList.add(s1);
			animalList.add(s2);
			animalList.add(m1);
			animalList.add(m2);
			animalList.add(b1);
			animalList.add(b2);
			tg.testExtends1(animalList);
//			tg.testExtends2(animalList);//编译报错，因为要求的参数类型带有泛型，而传入的参数类型泛型定义大于方法定义中的类型泛型范围
			tg.testExtends3(animalList);//可以作为参数传递进去，并且编辑不报错，但是其方法内部是不能利用传递的泛型类型进行操作的
			tg.testExtends4(animalList);//可以作为参数传递进去，并且编辑不报错，但是其方法内部是不能利用传递的泛型类型进行操作的
			
			List<Bird> birdList = new ArrayList<Bird>();
			birdList.add(s1);
			birdList.add(s2);
			birdList.add(m1);
			birdList.add(m2);
//			birdList.add(b1);  //加不进去
			tg.testExtends1(birdList);//编译没问题，因为方法定义时的类型范围大于实际传入参数的泛型范围
			tg.testExtends2(birdList);
//			tg.testExtends3(birdList);//编译即报错，因为参数必须是animal的父类以上类型。
			tg.testExtends4(birdList);//可以作为参数传递进去，并且编辑不报错，但是其方法内部是不能利用传递的泛型类型进行操作的
			
			List<Butterfly> butterflyList = new ArrayList<Butterfly>();
			butterflyList.add(b1);
			butterflyList.add(b2);
			
//			List<Animal> resultList1 = tg.testSuper(animalList,birdList,butterflyList);
//			List<Bird> resultList2 = tg.testSuper(animalList,birdList,butterflyList);
//			List<Butterfly> resultList3 = tg.testSuper(animalList,birdList,butterflyList);
			
//			List<Animal> resultList1 = tg.testSuper(s1,s2,m1,m2,b1,b2);
//			List<Bird> resultList2 = tg.testSuper(s1,s2,m1,m2,b1,b2);
//			List<Butterfly> resultList3 = tg.testSuper(s1,s2,m1,m2,b1,b2);
			
	}
	
	public void testExtends1(List<? extends Animal> animalList){
		for(Animal animal:animalList){
			System.out.print(animal.getName()+"--");
			animal.breath();
		}
	}

	public void testExtends2(List<? extends Bird> birdList){
		for(Bird bird:birdList){
			System.out.print(bird.getName()+"--");
			bird.sound();
		}
	}
	
	public void testExtends3(List<? super Animal> list){
//		for(Animal animal:list){ //打开注释后会发现这里list部分是编译报错的，因为super是指的animal的父类，或父类的父类，animal的父类就是object了，因此? super xxx 不适合用于作为参数传递
//			System.out.print(animal.getName()+"--");
//			animal.breath();
//		}
	}
	
	public void testExtends4(List<? super Bird> list){
		//同testExtends3
	}
	
	
	public List<Animal> testSuper(List<? super Animal>... lists){
		
		return null;
	}
}
