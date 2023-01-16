package com.xworkz;

import org.springframework.stereotype.Component;

@Component
public class Jio implements Provider{

	@Override
	public void connect() {
		System.out.println("provider running on connect");
	}

}
