package com.study.aop.theory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.study.aop.theory.service.SPAService;

@SpringBootApplication
public class AopTheoryApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = SpringApplication.run(AopTheoryApplication.class, args);
		
		SPAService spa = context.getBean(SPAService.class);
		spa.aromaOilMassage("Mike");
		spa.aromaOilMassage("Tony");
		spa.aromaOilMassage("Allen");
	}

}
