package com.e_commerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.e_commerce.model.Product;
import com.e_commerce.service.IProductService;

@SpringBootApplication
public class ECommerceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ECommerceApplication.class, args);
	}

	@Autowired
	IProductService IProductService;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Product product = new Product();
		product.setProductName("OnePlus8Pro");
		product.setCategory("Electronics");
		product.setBrand("Onplus");
		product.setPrice(28000);
		IProductService.addProduct(product);
		
	}
	
	
	

}
