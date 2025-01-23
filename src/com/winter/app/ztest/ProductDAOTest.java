package com.winter.app.ztest;

import java.util.List;

import com.winter.app.products.ProductDAO;
import com.winter.app.products.ProductDTO;

public class ProductDAOTest {

		private ProductDAO productDAO;
		
		public ProductDAOTest() {
			this.productDAO= new ProductDAO();
		}
		
		public void getList() throws Exception{
			List<ProductDTO> ar= productDAO.getList();
			if(ar.size()>0) {
				System.out.println("Test 성공");
			}else {
				System.out.println("Test 실패");
			}
		}
		
		public void getDetail() throws Exception {
			ProductDTO productDTO = new ProductDTO();
			productDTO.setProductDetail(0);
			//productDTO = productDTO.getDetail(productDTO);
		
			if(productDTO != null) {
				System.out.println("NULL이 아니다");
			}else {
				System.out.println("NULL이다");
			}
		}
		
		public void add() throws Exception{
			ProductDTO productDTO = new ProductDTO();
			productDTO.setProductNum(123);
			productDTO.setProductName("testname");
			productDTO.setProductDate(null);
			productDTO.setProductDetail(123);
			productDTO.setProductRate(1.1);
			
			
			
		}
}
