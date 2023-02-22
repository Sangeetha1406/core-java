package com.xworkz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.dto.BakeryDto;
import com.xworkz.service.BakeryService;

@Controller
@RequestMapping("/bakery")
public class BakeryComponent {
	@Autowired
	private BakeryService bakeryService;
	
	public BakeryComponent() {
		System.out.println("created.."+this.getClass().getSimpleName());
	}
	@PostMapping
	public String onBakery(BakeryDto bakeryDto,Model model)
	{
		System.out.println("running onbakery dto.."+bakeryDto);
		model.addAttribute("bname",bakeryDto.getBName());
		model.addAttribute("oName",bakeryDto.getOName());
		model.addAttribute("omarried",bakeryDto.isOMarried());
		model.addAttribute("bwife", bakeryDto.getWName());
		model.addAttribute("famous",bakeryDto.getFamous());
		model.addAttribute("since", bakeryDto.getBSince());
		boolean save=this.bakeryService.validateAndSave(bakeryDto);
		System.out.println("validate and save.." +save);
		return "Sucess.jsp";
		
	}

}
