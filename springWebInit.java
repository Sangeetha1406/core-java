package mvcproject;

import java.util.Arrays;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class springWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer{
	public springWebInit() {
		System.out.println("creted default..."+this.getClass().getSimpleName());
	}
	@Override
	protected Class<?>[] getRootConfigClasses() {
		Class[] configclass= {SpringBeanConfiguration.class};
		System.out.println("arrays..."+Arrays.toString(configclass));
		return configclass;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] ref= {SpringBeanConfiguration.class};
		System.out.println("arrays..."+Arrays.toString(ref));
		return ref;
	}

	@Override
	protected String[] getServletMappings() {
		String[] ref1= {"/"};
		System.out.println("arrays..."+Arrays.toString(ref1));
		return ref1;
	}
		
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("running");
		configurer.enable();
	}
	
	

}
