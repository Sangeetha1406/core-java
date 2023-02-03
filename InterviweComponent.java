package com.xworkz.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.dto.InterviweDto;

@Component
@RequestMapping("/job")
public class InterviweComponent {
	public InterviweComponent() {
		System.out.println("created..."+this.getClass().getSimpleName());
	}
	@PostMapping
	public String jobDetails(InterviweDto dto)
	{
		System.out.println("created job spring framework");
		System.out.println(" job details created... "+dto);
		return "interview.jsp";
		
	}
}
