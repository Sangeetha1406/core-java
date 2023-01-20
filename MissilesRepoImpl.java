package com.xworkz.dto.repository;

import org.springframework.stereotype.Component;

import com.xworkz.dto.MissilesDTO;

import lombok.NoArgsConstructor;
@Component
@NoArgsConstructor
public class MissilesRepoImpl implements MissilesRepo {

	
	@Override
	public boolean save(MissilesDTO dto) {
		System.out.println("validate and save");
		System.out.println("val and save..." +dto);
		return false;
	}

}
