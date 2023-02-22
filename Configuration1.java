package com.xworkz.configuartion;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class Configuration1 {
	public Configuration1() {
		System.out.println("created configuartion.....");
	}
	
}
