package com.xworkz.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.dto.AeroplaneDto;
import com.xworkz.dto.AeroplaneEntity;
import com.xworkz.repositiory.AeroplaneRepo;
@Service
public class AeroplaneServiceImpl implements AeroplaneService{
	
	@Autowired
	private AeroplaneRepo aeroplaneRepo;
	@Override
	public Set<ConstraintViolation<AeroplaneDto>> validateandsave(AeroplaneDto aeroplaneDto) {
		System.out.println("running ValantineServiceImpl.."+aeroplaneDto);
		ValidatorFactory validatorFactory=Validation.buildDefaultValidatorFactory();
		Validator validator=validatorFactory.getValidator();
		Set<ConstraintViolation<AeroplaneDto>> constraintViolation=validator.validate(aeroplaneDto);
		if(constraintViolation!=null && !constraintViolation.isEmpty() )
		{
			System.out.println("constraint violation does exist.....");
			return constraintViolation;
		}
		
		else
		{
			System.out.println("constraint violation does not exist...");
			AeroplaneEntity vEntity=new AeroplaneEntity();
			vEntity.setCompanyName(aeroplaneDto.getCompanyName());
			vEntity.setName(aeroplaneDto.getName());
			vEntity.setCost(aeroplaneDto.getCost());
			vEntity.setType(aeroplaneDto.getType());
			vEntity.setCountry(aeroplaneDto.getCountry());
			boolean saved=this.aeroplaneRepo.save(vEntity);
			return Collections.emptySet();
		}
				
		}
		@Override
		public AeroplaneDto findById(int id)
		{
			if(id>0)
			{
				AeroplaneEntity entity=this.aeroplaneRepo.findById(id);
				if(entity!=null)
				{
					System.out.println("entity is found "+id);
					AeroplaneDto dto=new AeroplaneDto();
					dto.setCompanyName(entity.getCompanyName());
					dto.setName(entity.getName());
					dto.setType(entity.getType());
					dto.setCountry(entity.getCountry());
					dto.setCost(entity.getCost());
					return dto;
					
				}
			}
			return AeroplaneService.super.findById(id);
		}
	}

