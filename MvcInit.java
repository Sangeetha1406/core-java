package com.xworkz.init;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.xworkz.configuartion.Configuration1;

public class MvcInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	public MvcInit() {
		System.out.println("created init");
	}
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		System.out.println("runing root");
		
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("runing serv");
		Class[] ref1= {Configuration1.class};
		return ref1;

	}

	@Override
	protected String[] getServletMappings() {
		String[] r= {"/"};
		return r;
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		// TODO Auto-generated method stub
		configurer.enable();
	}
	
	
		
		
	
	
	
	

}

