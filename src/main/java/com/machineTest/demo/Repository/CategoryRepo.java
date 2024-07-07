package com.machineTest.demo.Repository;


import org.springframework.data.repository.CrudRepository;

import com.machineTest.demo.Entity.Category;

public interface CategoryRepo extends CrudRepository<Category, Long> {

}
