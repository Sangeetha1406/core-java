package com.xworkz.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.dto.ValantineDto;
import com.xworkz.service.valantineService;

@Controller
@RequestMapping("/valantine")
public class ValantineController {
	
	@Autowired
	private valantineService valantineservice;
	
	List<String> places=Arrays.asList("shimoga","banglore","mysore","davangere");
	List<String> gifts=Arrays.asList("teddy","saree","foods","dress");
	
	@GetMapping
	public String onValantine(Model model)
	{
		System.out.println("running on valantine");
		model.addAttribute("gifts", gifts);
		model.addAttribute("places", places);
		return "valantine";
	}
	@PostMapping
	public String onValantine(Model model,ValantineDto dto)
	{
		System.out.println("running on valantine");
		Set<ConstraintViolation<ValantineDto>> violation=this.valantineservice.validateAndSave(dto);
		if(violation.isEmpty())
		{
			System.out.println("data sucess go to valantine sucees page");
			return "valantineSucess";
		}
		
		model.addAttribute("error", violation);
		
		model.addAttribute("gifts", gifts);
		model.addAttribute("places", places);
		return "valantine";
	}
}
