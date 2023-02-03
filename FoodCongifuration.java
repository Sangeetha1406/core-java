package com.xworkz.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class FoodCongifuration {

	public FoodCongifuration() {
		System.out.println("running FoodCongifuration...");
	}
}
