package com.xworkz.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Engine {
	private String name;
	private Type type;
	private String Company;
	@Autowired
	@Qualifier("num")
	private Integer number;
	@Autowired
	@Qualifier("ver")
	
	private Double version;
	private Boolean stroke;
	
	@Autowired
	public Engine(@Qualifier("names1")String name,@Qualifier("types")Type type,@Qualifier("comp")String Company)
	{
		this.name=name;
		this.type=type;
		this.Company=Company;
	}
	@Autowired
	@Qualifier("str")
	public void setStroke(boolean stroke) {
		this.stroke = stroke;
	}
	@Override
	public String toString() {
		return "Engine [name=" + name + ", type=" + type + ", number=" + number + ", version=" + version + ", Company="
				+ Company + ", stroke=" + stroke + "]";
	}
	
	

}
