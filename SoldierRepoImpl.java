package com.xworkz.dto.repository;

import com.xworkz.dto.SoldierDTO;

public class SoldierRepoImpl implements SoldierRepo{
	
	public SoldierRepoImpl()
	{
		System.out.println("created SoldierRepoImpl using no-arg const..");
	}

	@Override
	public boolean save(SoldierDTO dto) {
		System.out.println("starting validateAndSave");
		System.out.println("dto passed :" +dto);
		return false;
	}

}
