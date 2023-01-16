package com.xworkz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FireBox implements Browser{
	
	@Override
	public void browse() {
		System.out.println("browser running on firebox");
		
	}
	

}
