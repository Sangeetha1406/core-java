package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.things.Producer;

@Component
public class Movie {
	@Autowired
	private Director director;
	@Autowired
	private CameraMan cameraMan;
	@Autowired
	private Producer producer;
	
	public void shwos()
	{
		System.out.println("creting hascode movie");
		System.out.println(director.hashCode());
		System.out.println(cameraMan.hashCode());
		System.out.println(producer.hashCode());
	}

}
