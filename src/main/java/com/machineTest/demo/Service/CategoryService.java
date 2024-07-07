package com.machineTest.demo.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.machineTest.demo.Entity.Category;
import com.machineTest.demo.Repository.CategoryRepo;
@Service
public class CategoryService {


		@Autowired
		private	CategoryRepo categoryRepository;
		
		public List<Category> getAllCategories() {
	        return (List<Category>) categoryRepository.findAll();
	    }
		
	    public Category saveCategory(Category category) {
	        return categoryRepository.save(category);
	    }
	    
	    public Category getCategoryById(Long id) {
	        return categoryRepository.findById(id).orElse(null);
	    }
	    
	    public Category updateCategory(Long id, Category category) {
	        category.setId(id);
	        return categoryRepository.save(category);
	    }
	    
	    public void deleteCategory(Long id) {
	        categoryRepository.deleteById(id);
	    }

	}

