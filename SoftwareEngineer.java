package com.xworkz.configuration.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SoftwareEngineer {
	@Autowired()
	@Qualifier("name")
	private String name;
	@Autowired()
	@Qualifier("sal")
	
	private Integer salary;
	@Autowired()
	@Qualifier("compy")
	
	private String CompanyName;
	@Autowired()
	@Qualifier("exp")
	
	private String experiance;
	@Override
	public String toString() {
		return "SoftwareEngineer [name=" + name + ", salary=" + salary + ", CompanyName=" + CompanyName + ", experiance="
				+ experiance + "]";
	}

}
