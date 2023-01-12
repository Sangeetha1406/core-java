package com.xworkz;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.bean.BeanConfiguration;
import com.xworkz.things.Engine;
import com.xworkz.things.Ghost;
import com.xworkz.things.NewsPaper;
import com.xworkz.things.Snake;

public class RunnerFile {
	public static void main(String[] args) {
		ApplicationContext container=new AnnotationConfigApplicationContext(BeanConfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		System.out.println(container.getBeanDefinitionNames());

		NewsPaper p=container.getBean(NewsPaper.class);
		System.out.println(p);
		System.out.println("=================");
		Engine e=container.getBean(Engine.class);
		System.out.println(e);
		System.out.println("=================");
		Snake s=container.getBean(Snake.class);
		System.out.println(s);
		System.out.println("=================");
		Ghost s1=container.getBean(Ghost.class);
		System.out.println(s1);
		
	}

}
