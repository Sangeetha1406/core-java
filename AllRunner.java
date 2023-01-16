package com.xworkz.runner;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.Chrome;
import com.xworkz.FireBox;
import com.xworkz.PetrolBunk;
import com.xworkz.configuration.Configuration;

public class AllRunner {
public static void main(String[] args) {
	ApplicationContext container=new AnnotationConfigApplicationContext(Configuration.class);
	System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
	PetrolBunk pb=container.getBean(PetrolBunk.class);
	pb.purchase();
	Chrome c=container.getBean(Chrome.class);
	c.browse();
	FireBox f=container.getBean(FireBox.class);
	f.browse();	
}
}
