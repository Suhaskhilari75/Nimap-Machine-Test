package com.machineTest.demo.Entity;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;
@Entity
public class Category {

		@Id
		@GeneratedValue(strategy= GenerationType.IDENTITY)
		private Long id;
		
		
		@Column(name="name")
		private String name;
		 /*
		
		@OneToMany(targetEntity = Product.class,fetch = FetchType.EAGER,cascade = CascadeType.ALL)
		@JoinColumn(name = "CategoryProduct_fk",referencedColumnName = "categoryId")
		@JsonBackReference*/
		
		@OneToMany(mappedBy = "category",fetch = FetchType.LAZY)
		@JsonManagedReference("categoryReference")
		private List<Product> products;

		public Long getId() {
			return id;
		}

		public void setId(Long id2) {
			this.id = id2;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public List<Product> getProducts() {
			return products;
		}

		public void setProducts(List<Product> products) {
			this.products = products;
		}

		

	}
