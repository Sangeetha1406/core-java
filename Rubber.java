package com.xworkz.configuration.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Rubber {
	@Autowired()
	@Qualifier("nam1")
	private String name;
	@Autowired()
	@Qualifier("types")
	
	private String type;
	@Autowired()
	@Qualifier("prices")
	
	private Integer price;
	@Autowired()
	@Qualifier("colors")
	
	private String color;
	@Autowired()
	@Qualifier("shapes")
	
	private String shape;
	@Autowired()
	@Qualifier("stl1")
	
	private boolean stolen;
	@Autowired()
	@Qualifier("sizes")
	
	private Integer size;
	@Override
	public String toString() {
		return "Rubber [name=" + name + ", type=" + type + ", price=" + price + ", color=" + color + ", shape=" + shape
				+ ", stolen=" + stolen + ", size=" + size + "]";
	}

}
