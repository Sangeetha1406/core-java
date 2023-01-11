package com.xworkz.configuration.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Pencil {
	@Autowired()
	@Qualifier("name1")
	
	private String name;
	@Autowired()
	@Qualifier("typ")
	
	private String type;
	@Autowired()
	@Qualifier("pric")
	
	private Integer price;
	@Autowired()
	@Qualifier("clr")
	
	private String color;
	@Autowired()
	@Qualifier("sharp")
	
	private boolean sharp;
	@Autowired()
	@Qualifier("stl")
	
	private boolean stolen;
	@Override
	public String toString() {
		return "Pencil [name=" + name + ", type=" + type + ", price=" + price + ", color=" + color + ", sharp=" + sharp
				+ ", stolen=" + stolen + "]";
	}

}
