package com.e_commerce.service;

import java.util.List;
import java.util.Optional;

import com.e_commerce.model.Product;

public interface IProductService {

	public void addProduct(Product product);
	public List<Product> addListOfProducts(List<Product> products);
	public Optional<Product> getProductById(int productId);
	public List<Product> getAllProducts();
	public Product updateProduct(int productId);
	public void deleteProductById(int productId);
}
