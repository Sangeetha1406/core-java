package com.xworkz.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.dto.AeroplaneDto;

public interface AeroplaneService {
 Set<ConstraintViolation<AeroplaneDto>> validateandsave(AeroplaneDto aeroplaneDto);
 
 default AeroplaneDto findById(int id)
 {
	 System.out.println("running find method");
	return null;
 }
}
