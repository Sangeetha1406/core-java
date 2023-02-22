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
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.dto.AeroplaneDto;
import com.xworkz.service.AeroplaneService;


@Controller
@RequestMapping("/")
public class aeroplaneController {
	@Autowired
	private AeroplaneService aeroplaneservice;
	
	List<String> type=Arrays.asList("INDIA","JAPAN","AMERICA");
	List<String> country=Arrays.asList("PISTON AIRCRAFTS","LIGHT JETS","HEAVY JETS");
	
	public aeroplaneController() {
		System.out.println("created"+this.getClass().getSimpleName());
			}
	
	@GetMapping("/register")
	public String onAeroplane(Model model)
	{
		System.out.println("running on aeroplane method");
		model.addAttribute("type", type);
		model.addAttribute("country", country);
		return "Register";
	}
	@GetMapping("/search")
	public String onAeroplane(@RequestParam int id,Model model)
	{
		System.out.println("running on search"+id);
		AeroplaneDto dto=this.aeroplaneservice.findById(id);
		if(dto!=null)
		{
			model.addAttribute("dto", dto);
		}
		else
		{
			model.addAttribute("message", "data not found");
			
		}
		return "Search";	
	}
	
	@PostMapping("/register")
	public String onAeroplane(Model model,AeroplaneDto dto)
	{
		System.out.println("running on aeroplne");
		Set<ConstraintViolation<AeroplaneDto>>constraintViolation=this.aeroplaneservice.validateandsave(dto);
		if(constraintViolation.isEmpty())
		{
			System.out.println("data sucess go to search page");
			return "Register";
		}
		model.addAttribute("error", constraintViolation);
		model.addAttribute("type", type);
		model.addAttribute("country", country);
		model.addAttribute("dto", dto);
		return "constraintViolation";
	}
}