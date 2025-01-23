package com.winter.app.products;

import java.sql.Date;

public class ProductDTO {
		
		private long productNum;
		private String productName;
		private double productRate;
		private  Date productDate; //Date 데이터타입은 import 꼭 해주기
		private long productDetail;
		
		
		public long getProductNum() {
			return productNum;
		}
		public void setProductNum(long productNum) {
			this.productNum = productNum;
		}
		public String getProductName() {
			return productName;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}
		public double getProductRate() {
			return productRate;
		}
		public void setProductRate(double productRate) {
			this.productRate = productRate;
		}
		public Date getProductDate() {
			return productDate;
		}
		public void setProductDate(Date productDate) {
			this.productDate = productDate;
		}
		public long getProductDetail() {
			return productDetail;
		}
		public void setProductDetail(long productDetail) {
			this.productDetail = productDetail;
		}
		
		
}		