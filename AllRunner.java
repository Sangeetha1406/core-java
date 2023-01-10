package com.workz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.config.RocketConfig;
import com.xworkz.things.Actor;
import com.xworkz.things.Rocket;
import com.xworkz.things.Season;

public class AllRunner {
public static void main(String[] args) {
	ApplicationContext ref=new AnnotationConfigApplicationContext(RocketConfig.class);
	System.out.println("==============with class Rocket literals====");
	Rocket r=ref.getBean("rocket",Rocket.class);
	System.out.println(r.getCountry());
	System.out.println(r.getName());
	System.out.println(r.getBudget());
	System.out.println("==============Rocket with methode object with literals=========");
	
	Rocket r1=ref.getBean("rocky",Rocket.class);
	System.out.println(r1);
	System.out.println(r1.getCountry());
	System.out.println(r1.getName());
	System.out.println(r1.getBudget());
	
	System.out.println("======Actor class with constructor======");
	Actor a=ref.getBean("actor",Actor.class);
	System.out.println(a);
	System.out.println(a.getName());
	System.out.println(a.getLanguage());
	System.out.println(a.getAge());
	System.out.println("====Actor constructor with methode object=====");
	Actor a1=ref.getBean("act",Actor.class);
	System.out.println(a1);
	System.out.println(a1.getName());
	System.out.println(a1.getLanguage());
	System.out.println(a1.getAge());
	System.out.println("======Actor class with constructor======");
	Season a11=ref.getBean("season",Season.class);
	System.out.println(a11);
	System.out.println(a11.getName());
	System.out.println(a11.getDuration());
	System.out.println(a11.getStartingMonth());
	System.out.println("====Actor constructor with methode object=====");
	Season a2=ref.getBean("sea",Season.class);
	System.out.println(a2);
	System.out.println(a2.getName());
	System.out.println(a2.getDuration());
	System.out.println(a2.getStartingMonth());
	
}
}
