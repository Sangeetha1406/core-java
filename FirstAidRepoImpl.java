package com.xworkz.dto.repository;

import org.springframework.stereotype.Component;

import com.xworkz.dto.FirstAidDTO;

import lombok.NoArgsConstructor;
@Component
@NoArgsConstructor
public class FirstAidRepoImpl implements FirstAidRepo {

	@Override
	public boolean save(FirstAidDTO aiddto) {
		System.out.println("save...");
		System.out.println("save... "+aiddto);
		return false;
	}

}
