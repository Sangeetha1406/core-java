package com.xworkz.webinit;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.xworkz.configuration.AeroplaneConfiguration;

public class WebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	public WebInit() {
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
		Class[] ref1= {AeroplaneConfiguration.class};
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
		
		
	
