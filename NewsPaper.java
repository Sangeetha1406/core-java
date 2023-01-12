package com.xworkz.things;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NewsPaper {
	@Autowired()
	@Qualifier("ids")
	private Integer id;
	private String name;
	private String ownerName;
	@Autowired()
	@Qualifier("lang")
	private String language;
	private Double price;
	
	@Autowired
	public NewsPaper( @Qualifier("names") String name,@Qualifier("ownerNames")String ownerName)
	{
		this.name=name;
		this.ownerName=ownerName;
	}
	@Autowired
	@Qualifier("prc")
	public void setPrice(Double price) 
	{
		this.price = price;
	}
	@Override
	public String toString() {
		return "NewsPaper [id=" + id + ", name=" + name + ", ownerName=" + ownerName + ", language=" + language
				+ ", price=" + price + "]";
	}

}


