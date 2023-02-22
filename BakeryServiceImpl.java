package com.xworkz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.dto.BakeryDto;
import com.xworkz.repository.BakeryRepo;
@Service
public class BakeryServiceImpl  implements BakeryService {
	@Autowired
	BakeryRepo repo;
	
	public BakeryServiceImpl() {
		
		System.out.println("running constructor service......");
	}
	

	@Override
	public boolean validateAndSave(BakeryDto dto) {
		System.out.println("running save in bakery service");
		boolean saved=this.repo.save(dto);
		System.out.println("savedd..to repo "+saved);
		return false;
	}

}
