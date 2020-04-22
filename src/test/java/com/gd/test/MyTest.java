package com.gd.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gd.bean.Camp;
import com.gd.bean.Hero;
import com.gd.service.HeroService;
import com.gd.service.HeroServiceImp;

public class MyTest {
	
	@SuppressWarnings("resource")
	@Test
	public void test01(){
		ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
		HeroServiceImp service = (HeroServiceImp) app.getBean("heroServiceImp");
		Hero hero = service.selectOneHero(1);
		System.out.println(hero);
	}
	
	@Test
	public void test02(){
		ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
		HeroServiceImp service = (HeroServiceImp) app.getBean("heroServiceImp");
		int i = service.updateHero(2);
		if(i>0){
			System.out.println("购买成功");
		}else{
			System.out.println("已用该英雄，无法购买");
		}
	}
	
	@Test
	public void test03(){
		ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
		HeroServiceImp service = (HeroServiceImp) app.getBean("heroServiceImp");
		Hero hero = new Hero(0,"西施",13888,0,new Camp(2,null));
		int i = service.insertHero(hero);
		if(i>0){
			System.out.println("添加成功");
		}else{
			System.out.println("添加失败");
		}
	}
}
