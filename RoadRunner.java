package com.xworkz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.things.Area;
import com.xworkz.things.Chocolate;
import com.xworkz.things.Cycle;
import com.xworkz.things.Girl;
import com.xworkz.things.Mask;
import com.xworkz.things.Milk;
import com.xworkz.things.Patient;
import com.xworkz.things.Road;

public class RoadRunner {
	public static void main(String[] args) {
		ApplicationContext spring=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Road ref=spring.getBean(Road.class);
		System.out.println("refrence of road cls is : "+ref);
		
		Cycle ref1=spring.getBean(Cycle.class);
		
		System.out.println("ref of cycle class is: "+ref1);
		Girl ref2=spring.getBean(Girl.class);
		

		Mask ref4=spring.getBean(Mask.class);
		
		Patient re5=spring.getBean(Patient.class);
		
		Chocolate re6=spring.getBean(Chocolate.class);
		
		
		
		
		
		

	}

}
