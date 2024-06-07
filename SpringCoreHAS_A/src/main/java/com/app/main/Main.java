package com.app.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.bean.Product;
import com.app.config.AppConfig;

public class Main {
	public static void main(String[] args) {
		System.out.println("Prog start.......");
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Product pp = (Product) ac.getBean("prodObj");
		
		System.out.println(pp);
		
		System.out.println("End start.......");
	}
}
