package com.xworkz.service;

import java.util.Set;

import javax.validation.Constraint;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.dto.SoldierDTO;
import com.xworkz.dto.repository.SoldierRepo;

public class SolderServiceImpl implements SoldierService {
	SoldierRepo repo;
	public SolderServiceImpl()
	{
		System.out.println("created soldierServiceImpl ");
	}
	
	public void setRepo(SoldierRepo repo) {
		this.repo = repo;
	}
	
	@Override
	public boolean validateAndSave(SoldierDTO dto) {
		System.out.println("inside the validate and save");
		
		ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		Validator validator=factory.getValidator();
		Set<ConstraintViolation<SoldierDTO>> violation=validator.validate(dto);
		if(!violation.isEmpty())
		{
			System.out.println("validation errors");
			violation.forEach(v->System.out.println(v.getMessage()));
			return false;
		}
		else
		{
			System.out.println("valid data");
			repo.save(dto);
			return true;
		}
		
		
	}

}
