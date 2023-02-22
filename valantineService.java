package com.xworkz.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.dto.ValantineDto;

public interface valantineService {
	Set<ConstraintViolation<ValantineDto>> validateAndSave(ValantineDto dto);
}
