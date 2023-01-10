package com.xworkz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//import com.xworkz.things.ArrayList;

public class RunnerFile {
public static void main(String[] args) {
	ApplicationContext spring=new AnnotationConfigApplicationContext(SuperConfiguration.class);
	
	String str1=spring.getBean("rat",String.class);
	System.out.println(str1.hashCode());
	
	String str2=spring.getBean("flower",String.class);
	System.out.println(str2.hashCode());
	
	String str3=spring.getBean("window",String.class);
	System.out.println(str3.hashCode());
	
	String str4=spring.getBean("chair",String.class);
	System.out.println(str4.hashCode());
	
	String str5=spring.getBean("table",String.class);
	System.out.println(str5.hashCode());
	
	System.out.println("=======================================");
	
	Boolean b1=spring.getBean("s1",Boolean.class);
	System.out.println(b1.hashCode());
	
	Boolean b2=spring.getBean("s2",Boolean.class);
	System.out.println(b2.hashCode());
	
	Boolean b3=spring.getBean("s3",Boolean.class);
	System.out.println(b3.hashCode());
	
	Boolean b4=spring.getBean("s4",Boolean.class);
	System.out.println(b4.hashCode());
	
	Boolean b5=spring.getBean("s5",Boolean.class);
	System.out.println(b5.hashCode());
	
	System.out.println("=========================================");
	
	Double d1=spring.getBean("e1",Double.class);
	System.out.println(d1.hashCode());
	
	Double d2=spring.getBean("e2",Double.class);
	System.out.println(d2.hashCode());
	
	Double d3=spring.getBean("e3",Double.class);
	System.out.println(d3.hashCode());
	
	Double d4=spring.getBean("e4",Double.class);
	System.out.println(d4.hashCode());
	
	Double d5=spring.getBean("e5",Double.class);
	System.out.println(d5.hashCode());
	
	System.out.println("===========================================");
	StringBuffer a1=spring.getBean("buf1",StringBuffer.class);
	System.out.println(a1.hashCode());
			
	StringBuffer a2=spring.getBean("buf2",StringBuffer.class);
	System.out.println(a2.hashCode());
	
	StringBuffer a3=spring.getBean("buf3",StringBuffer.class);
	System.out.println(a3.hashCode());
	
	StringBuffer a4=spring.getBean("buf4",StringBuffer.class);
	System.out.println(a4.hashCode());
	
	StringBuffer a5=spring.getBean("buf5",StringBuffer.class);
	System.out.println(a5.hashCode());
	
	System.out.println("===========================================");
	StringBuilder sa1=spring.getBean("build1",StringBuilder.class);
	System.out.println(sa1.hashCode());
			
	StringBuilder sa2=spring.getBean("build2",StringBuilder.class);
	System.out.println(sa2.hashCode());
	
	StringBuilder sa3=spring.getBean("build3",StringBuilder.class);
	System.out.println(sa3.hashCode());
	
	StringBuilder sa4=spring.getBean("build4",StringBuilder.class);
	System.out.println(sa4.hashCode());
	
	StringBuilder sa5=spring.getBean("build5",StringBuilder.class);
	System.out.println(sa5.hashCode());
	
	System.out.println("=======================");
	ArrayList ar=spring.getBean("arr1",ArrayList.class);
	System.out.println(ar.hashCode());
	
	System.out.println("============================");
	HashMap h1=spring.getBean("m1",HashMap.class);
	System.out.println(h1.hashCode());
	
	System.out.println("======================");
	String[] bean=spring.getBeanDefinitionNames();
	System.out.println(Arrays.toString(bean));
	
	
	
	
	
	
	
	
//	ArrayList arr1=ref.getBean("arr1",ArrayList.class);
//	System.out.println(arr1.hashCode());
//	
}
}
