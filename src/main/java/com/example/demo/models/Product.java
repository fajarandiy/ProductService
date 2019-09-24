package com.example.demo.models;

import javax.persistence.*;
@Entity
public class Product {

		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int id;
		private String code;
		private String name;
		private double price;
		private String image;
		private String merchant;
		private String type;
		private String description;
		private String additionalInfo;
		private String status;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getCode() {
			return code;
		}
		public void setCode(String code) {
			this.code = code;
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
		public String getImage() {
			return image;
		}
		public void setImage(String image) {
			this.image = image;
		}
		public String getMerchant() {
			return merchant;
		}
		public void setMerchant(String merchant) {
			this.merchant = merchant;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getAdditionalInfo() {
			return additionalInfo;
		}
		public void setAdditionalInfo(String additionalInfo) {
			this.additionalInfo = additionalInfo;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		
	


}
