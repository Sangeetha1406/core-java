package com.xworkz.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/home")
public class FoodComponent {

	public FoodComponent() {
	System.out.println("created " +this.getClass().getTypeName());
	}
	
	@PostMapping
	public String onSend(@RequestParam String name, @RequestParam String type, @RequestParam int quantity, @RequestParam double price)
	{
		System.out.println("running onsend post");
		System.out.println("Name :" +name);
		System.out.println("Type :" +type);
		System.out.println("Quantity :" +quantity);
		System.out.println("Price :" +price);
		
		return "foodItem.jsp";
	}
}
