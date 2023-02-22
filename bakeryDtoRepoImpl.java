package com.xworkz.repository;

import org.springframework.stereotype.Repository;

import com.xworkz.dto.BakeryDto;
@Repository
public class bakeryDtoRepoImpl implements BakeryRepo{
	public bakeryDtoRepoImpl() {
		System.out.println("running bakery dto impl");
	}

	@Override
	public boolean save(BakeryDto dto) {
		System.out.println("running a bakery dto...");
		return false;
	}

}
