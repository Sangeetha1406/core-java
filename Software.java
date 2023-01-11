package com.xworkz.configuration.bean;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Software {
	@Autowired()
	@Qualifier("names")
	private String name;
	@Autowired()
	@Qualifier("vaersions")
	private String version;
	@Autowired()
	@Qualifier("developers")
	private String developer;
	@Autowired()
	@Qualifier("dat")
	private LocalDate date;
	@Autowired()
	@Qualifier("frees")
	private boolean free;
	@Override
	public String toString() {
		return "Software [name=" + name + ", version=" + version + ", developer=" + developer + ", date=" + date
				+ ", free=" + free + "]";
	}
	
	

}
