package com.e_commerce.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.e_commerce.model.Product;


@Repository
public interface IProductRepo extends JpaRepository<Product, Integer> {

}
