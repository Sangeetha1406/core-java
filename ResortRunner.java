package com.xworkz.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.configuration.SuperConfiguration;
import com.xworkz.dto.ResortDTO;
import com.xworkz.service.ResortService;

public class ResortRunner {
	public static void main(String[] args) {
		ApplicationContext container=new AnnotationConfigApplicationContext(SuperConfiguration.class);
		ResortService resort=container.getBean(ResortService.class);
		boolean b=resort.ValidateAndSave(new ResortDTO());
		System.out.println("save..." +b);
	}
}
