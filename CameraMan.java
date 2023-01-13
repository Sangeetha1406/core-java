package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CameraMan {
	@Autowired
	private Camera camera;
	public void cameraMan()
	{
		System.out.println("creating hashcode camera man");
		System.out.println(camera.hashCode());
	}
}
