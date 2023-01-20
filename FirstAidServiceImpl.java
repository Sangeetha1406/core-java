package com.xworkz.service;


import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.dto.FirstAidDTO;
import com.xworkz.dto.repository.FirstAidRepo;
@Component
public class FirstAidServiceImpl implements FirstAidService {
	@Autowired
	private Validator validator;
	private FirstAidRepo firstAidRepo;

	@Autowired
	public FirstAidServiceImpl(FirstAidRepo firstAidRepo) {
		this.firstAidRepo=firstAidRepo;
		System.out.println("creted service passing by spring");
	}
	@Override
	public boolean validateAndSave(FirstAidDTO aiddto) {
		System.out.println("validate and save");
		System.out.println("pass ref "+aiddto);

		Set<ConstraintViolation<FirstAidDTO>> violations=this.validator.validate(aiddto);
		
		if(!violations.isEmpty()) {
			System.out.println("there are validation errors");
			violations.forEach(v->System.out.println(v.getMessage()));
			return false;
		}
		else {
			System.out.println("data is valid..");
			boolean saved=this.firstAidRepo.save(aiddto);
			System.out.println("save first "+saved);
			return  saved;
		}
		
	}

}
