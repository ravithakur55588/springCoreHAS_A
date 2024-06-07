package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.bean.Model;
import com.app.bean.Product;

@Configuration
public class AppConfig {
    
	@Bean
    public Model modObj() {
    	Model m = new Model();
    	m.setMod(101);
    	return m;
    }
    
    @Bean
    public Product prodObj() {
    	Product p = new Product();
    	p.setPid(201);
    	p.setMd(modObj());
    	
    	return p;
    } 
    
}
