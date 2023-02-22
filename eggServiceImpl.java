package com.xworkz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.dto.EggDto;
import com.xworkz.repo.eggRepo;
@Service
public class eggServiceImpl implements eggService{
	
	@Autowired
	private eggRepo eggrepo;
	
	public eggServiceImpl() {
		System.out.println("created.."+this.getClass().getSimpleName());
	}

	@Override
	public boolean validateandSave(EggDto dto) {
		System.out.println("running validate and save..");
		boolean save=this.eggrepo.save(dto);
		System.out.println("saved.."+save);
		return false;
	}

}
