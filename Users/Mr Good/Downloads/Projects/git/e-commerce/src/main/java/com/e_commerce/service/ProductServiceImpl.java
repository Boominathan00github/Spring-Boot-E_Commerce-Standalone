package com.e_commerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.e_commerce.model.Product;
import com.e_commerce.repo.IProductRepo;


@Service
public class ProductServiceImpl implements IProductService {
	
	@Autowired
	private IProductRepo IProductRepo; 

	@Override
	public void addProduct(Product product) {
		//insert the data into database
		IProductRepo.save(product);

	}

	@Override
	public List<Product> addListOfProducts(List<Product> products) {
		// TODO Auto-generated method stub
		return IProductRepo.saveAll(products);
	}

	@Override
	public Optional<Product> getProductById(int productId) {
		// TODO Auto-generated method stub
		Optional<Product> productOpt = IProductRepo.findById(productId);
		if(!productOpt.isPresent()) {
			return null;
		}
		return productOpt;
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return IProductRepo.findAll();
	}

	@Override
	public Product updateProduct(int productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProductById(int productId) {
		// TODO Auto-generated method stub
		IProductRepo.deleteById(productId);;
	}

}
