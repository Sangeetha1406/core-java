package com.xworkz.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.configuration.SuperConfiguration;
import com.xworkz.dto.MissilesDTO;
import com.xworkz.service.FirstAidService;
import com.xworkz.service.MissilesService;

public class MissilesRunner {
public static void main(String[] args) {
	ApplicationContext container=new AnnotationConfigApplicationContext(SuperConfiguration.class);
	MissilesService missilesService=container.getBean(MissilesService.class);
	boolean save=missilesService.validateAndSave(new MissilesDTO());
	System.out.println("saveeed..." +save);
}
}
