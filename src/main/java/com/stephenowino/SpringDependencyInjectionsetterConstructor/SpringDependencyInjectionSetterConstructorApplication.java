package com.stephenowino.SpringDependencyInjectionsetterConstructor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
@ComponentScan
public class SpringDependencyInjectionSetterConstructorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDependencyInjectionSetterConstructorApplication.class, args);

		//IOC Container created
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student stud = context.getBean("student" ,Student.class);
		stud.StudentName();

		Student joyce = context.getBean("joyce" , Student.class);
		joyce.StudentName();

	}

}
