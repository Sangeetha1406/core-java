package com.xworkz.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class webmvcinit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	public webmvcinit() {
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
		
		configurer.enable();
	}
	
	
		
		
	
	
	
	

}

