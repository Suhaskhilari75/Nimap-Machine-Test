package com.machineTest.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.machineTest.demo.Entity.Category;
import com.machineTest.demo.Service.CategoryService;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	@GetMapping("/{id}")

	public Category getCategoryById(@PathVariable long id) {
		return categoryService.getCategoryById(id);
	}

	@GetMapping
	public List<Category> getAllcategory() {
		return categoryService.getAllCategories();
	}

	@PostMapping
	public Category createCategory(@RequestBody Category category) {
		return categoryService.saveCategory(category);
	}

	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable long id) {
		categoryService.deleteCategory(id);
	}

	@PutMapping("/{id}")
	public Category update(@PathVariable long id,@RequestBody Category category) {
		return categoryService.updateCategory(id, category);
	}
	
	
}
