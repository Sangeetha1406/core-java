package com.xworkz.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.dto.MissilesDTO;
import com.xworkz.dto.repository.MissilesRepo;

import lombok.NoArgsConstructor;
@Component

public class MissilesServiceImpl implements MissilesService {
	@Autowired
	private Validator validator;
	private MissilesRepo missilesRepo;

	@Autowired
	public MissilesServiceImpl(MissilesRepo missilesRepo)
	{
		this.missilesRepo=missilesRepo;
		System.out.println("creted service passing by spring");
	}

	@Override
	public boolean validateAndSave(MissilesDTO dto) {
		System.out.println("saving........");
		System.out.println("ref " +dto);

		Set<ConstraintViolation<MissilesDTO>> viloations=this.validator.validate(dto);
		if(!viloations.isEmpty()) {
			System.out.println("there are validation errors");
			viloations.forEach(v->System.out.println(v.getMessage()));
			return false;
		}
		else {
			System.out.println("data is valid..");
			boolean saved=this.missilesRepo.save(dto);
			System.out.println("save first "+saved);
			return  saved;

		}
	}
}
