package com.xworkz.configuration.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Hardwareshop {
	@Autowired()
	@Qualifier("ids")
	private int id;
	@Autowired()
	@Qualifier("names")
	private String name;
	@Autowired()
	@Qualifier("gstNumber")
	private String gstNo;
	@Autowired()
	@Qualifier("ownerNames")
	private String ownerName;
	@Autowired()
	@Qualifier("add")
	private String  address;
	
	@Override
	public String toString() {
		return "Hardwareshop [id=" + id + ", name=" + name + ", gstNo=" + gstNo + ", ownerName=" + ownerName
				+ ", address=" + address + "]";
	}
	
	

}
