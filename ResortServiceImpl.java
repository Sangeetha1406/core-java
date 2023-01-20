package com.xworkz.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.dto.ResortDTO;
import com.xworkz.dto.repository.ResortRepo;
@Component
public class ResortServiceImpl implements ResortService{
	
	@Autowired
	private Validator validator;
	private ResortRepo resortRepo ;
	
	@Autowired
	public ResortServiceImpl(ResortRepo resortRepo)
	{
		this.resortRepo=resortRepo;
		System.out.println("created repo passing by service");
	}

	@Override
	public boolean ValidateAndSave(ResortDTO repo1) {
		System.out.println("valid and save.....");
		System.out.println("ValidateAndSave "+repo1);
		
		Set<ConstraintViolation<ResortDTO>> violation=this.validator.validate(repo1);
		
		if(!violation.isEmpty())
		{
			System.err.println("there are validation errors");
			violation.forEach(e->System.out.println(e.getMessage()));
			return false;
		}
		else
		{
			System.out.println("valid data");
			boolean save=this.resortRepo.save(repo1);
			System.out.println(save);
			return save;
		}
	}

}
