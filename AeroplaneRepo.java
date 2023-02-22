package com.xworkz.repositiory;

import com.xworkz.dto.AeroplaneEntity;

public interface AeroplaneRepo {
 boolean save(AeroplaneEntity aeroplaneentity);
 
 default AeroplaneEntity findById(int id)
 {
	 System.out.println("running find method in repo");
	return null;
 }

}
