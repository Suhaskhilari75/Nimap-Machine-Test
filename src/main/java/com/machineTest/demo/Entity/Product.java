package com.machineTest.demo.Entity;
import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;
@Entity
public class Product {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		
		@Column(name = "Product_Name")
		private String name;
		
		@Column(name="Price")
		private double price;
		

		@ManyToOne
		@JoinColumn(name = "category_id")
		@JsonBackReference("categoryReference")
		private Category category;


		public long getId() {
			return id;
		}


		public void setId(long id2) {
			this.id = id2;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public double getPrice() {
			return price;
		}


		public void setPrice(double price) {
			this.price = price;
		}


		public Category getCategory() {
			return category;
		}


		public void setCategory(Category category) {
			this.category = category;
		}

		


	}

