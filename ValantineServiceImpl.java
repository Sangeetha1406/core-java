package com.xworkz.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.dto.ValantineDto;
import com.xworkz.dto.ValentineEntityTable;
import com.xworkz.repositiory.ValentineEntityRepo;
@Service
public class ValantineServiceImpl implements valantineService{
	@Autowired
	private ValentineEntityRepo valentineEntityRepoo;

	public ValantineServiceImpl() {
		System.out.println("running valantine service impl.."+this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<ValantineDto>> validateAndSave(ValantineDto dto) {
		System.out.println("running ValantineServiceImpl.."+dto);
		ValidatorFactory validatorFactory=Validation.buildDefaultValidatorFactory();
		Validator validator=validatorFactory.getValidator();
		Set<ConstraintViolation<ValantineDto>> constraintViolation=validator.validate(dto);
		if(constraintViolation!=null && !constraintViolation.isEmpty() )
		{
			System.out.println("constraint violation does exist.....");
			return constraintViolation;
		}
		else
		{
			System.out.println("constraint violation does not exist...");
			ValentineEntityTable vEntity=new ValentineEntityTable();
			vEntity.setName(dto.getName());
			vEntity.setValentineName(dto.getValentineName());
			vEntity.setMettingPlace(dto.getMettingPlace());
			vEntity.setGift(dto.getGift());
			boolean saved=this.valentineEntityRepoo.save(vEntity);
			return Collections.emptySet();
		}
	}

}
