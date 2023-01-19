package com.xworkz.boot;

import com.xworkz.dto.SoldierDTO;
import com.xworkz.dto.repository.SoldierRepo;
import com.xworkz.dto.repository.SoldierRepoImpl;
import com.xworkz.service.SolderServiceImpl;

public class Runner {
public static void main(String[] args) {
	SoldierDTO dto=new SoldierDTO("sangeerga", 101, "first", "bat", "india");
	SolderServiceImpl serv=new SolderServiceImpl();
	SoldierRepo repo=new SoldierRepoImpl();
	serv.setRepo(repo);
	serv.validateAndSave(dto);
	
	
}
}
