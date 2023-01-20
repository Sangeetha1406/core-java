package com.xworkz.dto.repository;

import org.springframework.stereotype.Component;

import com.xworkz.dto.ResortDTO;

import lombok.NoArgsConstructor;
@Component
@NoArgsConstructor
public class ResortImpl implements ResortRepo {

	@Override
	public boolean save(ResortDTO dto) {
		System.out.println("save  the dto");
		System.out.println("save..." +dto);
		return false;
	}

}
