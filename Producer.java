package com.xworkz.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Producer {
	@Autowired
	private Assistant assistant;
	@Autowired
	private Company company;

	public void prd() {
		System.out.println("creting hashcode producer");
		System.out.println(assistant.hashCode());
		System.out.println(company.hashCode());

	}

}
