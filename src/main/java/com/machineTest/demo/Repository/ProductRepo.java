package com.machineTest.demo.Repository;

import org.springframework.data.repository.CrudRepository;

import com.machineTest.demo.Entity.Product;

public interface ProductRepo extends CrudRepository<Product,Long> {

}
