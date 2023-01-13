package com.xworkz;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sun.jdi.Location;
import com.xworkz.beans.Battery;
import com.xworkz.beans.Camera;
import com.xworkz.beans.CameraMan;
import com.xworkz.beans.Director;
import com.xworkz.beans.Experiance;
import com.xworkz.beans.Lens;
import com.xworkz.beans.Movie;
import com.xworkz.configuration.AllConfiguration;
import com.xworkz.things.Company;
import com.xworkz.things.Loaction;
import com.xworkz.things.Producer;

public class RunnerFile {
	public static void main(String[] args) {
		ApplicationContext container=new AnnotationConfigApplicationContext(AllConfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		Loaction lo=container.getBean(Loaction.class);
		lo.area();
		System.out.println("=====================");
		Company l=container.getBean(Company.class);
		l.show();
		System.out.println("====================");
		Producer p=container.getBean(Producer.class);
		p.prd();
		System.out.println("================");
		Battery b=container.getBean(Battery.class);
		b.bat();
		System.out.println("===========================");
		Lens l1=container.getBean(Lens.class);
		l1.lens();
		System.out.println("========================");
		Camera camera=container.getBean(Camera.class);
		camera.camera();
		System.out.println("========================");

		CameraMan cm=container.getBean(CameraMan.class);
		cm.cameraMan();

		System.out.println("========================");

		Experiance exp=container.getBean(Experiance.class);
		exp.experiance();;
		System.out.println("========================");

		Director dir=container.getBean(Director.class);
		dir.director();
		System.out.println("========================");

		Movie mv=container.getBean(Movie.class);
		mv.shwos();

	}
}
