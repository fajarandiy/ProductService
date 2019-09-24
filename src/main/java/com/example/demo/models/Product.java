package com.example.demo.models;

import javax.persistence.*;
@Entity
public class Product {

		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int id;
		private String productCode;
		private String name;
		private double price;
		private String image;
		private String merchant;
		private String productType;
		private String description;
		private String additionalInfo;
		private String status;
		
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
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getProductCode() {
			return productCode;
		}
		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}
		public String getMerchant() {
			return merchant;
		}
		public void setMerchant(String merchant) {
			this.merchant = merchant;
		}
		public String getProductType() {
			return productType;
		}
		public void setProductType(String productType) {
			this.productType = productType;
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
