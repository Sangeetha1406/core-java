package com.xworkz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.dto.EggDto;
import com.xworkz.service.eggService;

@Controller
@RequestMapping("/egg")
public class EggController {
	@Autowired
	private eggService eggservice;
	
	public EggController() {
		System.out.println("created.."+this.getClass().getSimpleName());
	}
	@PostMapping
	public String onEgg(EggDto dto,Model model)
	{
		System.out.println("running onEgg..."+dto);
		boolean save=this.eggservice.validateandSave(dto);
		System.out.println("save.."+save);
		return "index";
		
	}
	
}
