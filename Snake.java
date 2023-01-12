package com.xworkz.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Snake {
	private String name;
	@Autowired
	@Qualifier("slength")
	private Double length;
	@Autowired
	@Qualifier("scolor")
	
	private String color;
	private Type type;
	private Boolean poisionous;
	@Autowired
	public Snake(@Qualifier("sname")String name, @Qualifier("stype")Type type,@Qualifier("spisionous") Boolean poisionous) {
		super();
		this.name = name;
		this.type = type;
		this.poisionous = poisionous;
	}
	@Override
	public String toString() {
		return "Snake [name=" + name + ", length=" + length + ", color=" + color + ", type=" + type + ", poisionous="
				+ poisionous + "]";
	}

}
