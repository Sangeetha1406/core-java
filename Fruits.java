package com.xworkz.configuration.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Fruits {
	@Autowired()
	@Qualifier("names1")

	private String name;
	@Autowired()
	@Qualifier("clr1")

	private String color;
	@Autowired()
	@Qualifier("shp")

	private String shape;
	@Autowired()
	@Qualifier("helath")

	private boolean healthy;
	@Autowired()
	@Qualifier("stoln")

	private boolean stolen;
	@Autowired()
	@Qualifier("prt")

	private boolean protien;
	@Autowired()
	@Qualifier("brd")

	private String breed;
	@Autowired()
	@Qualifier("bught")

	private String bought;
	@Autowired()
	@Qualifier("pric1")

	private Integer price;
	@Override
	public String toString() {
		return "Fruits [name=" + name + ", color=" + color + ", shape=" + shape + ", healthy=" + healthy + ", stolen="
				+ stolen + ", protien=" + protien + ", breed=" + breed + ", bought=" + bought + ", price=" + price
				+ "]";
	}


}

