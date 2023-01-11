package com.xworkz;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.configuration.BeanConfiguration;
import com.xworkz.configuration.bean.Fruits;
import com.xworkz.configuration.bean.Hardwareshop;
import com.xworkz.configuration.bean.Pencil;
import com.xworkz.configuration.bean.Rubber;
import com.xworkz.configuration.bean.Software;
import com.xworkz.configuration.bean.SoftwareEngineer;

public class Runner {
	public static void main(String[] args) {
		ApplicationContext container=new AnnotationConfigApplicationContext(BeanConfiguration.class);
		System.out.println("========================");
		
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		Hardwareshop hard=container.getBean(Hardwareshop.class);
		System.out.println(hard);
		System.out.println("======================================");
		Software soft=container.getBean(Software.class);
		System.out.println(soft);
		System.out.println("======================================");
		SoftwareEngineer softeng=container.getBean(SoftwareEngineer.class);
		System.out.println(softeng);
		System.out.println("======================================");
		Pencil stl1=container.getBean(Pencil.class);
		System.out.println(stl1);
		System.out.println("======================================");
		Rubber rab=container.getBean(Rubber.class);
		System.out.println(rab);
		System.out.println("======================================");
		Fruits f=container.getBean(Fruits.class);
		System.out.println(f);
		
		
	}
}
