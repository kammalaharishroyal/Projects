package com.harish.productservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harish.productservice.dto.ProductRequest;
import com.harish.productservice.dto.ProductResponse;
import com.harish.productservice.entity.Product;
import com.harish.productservice.repository.ProductRepo;

import lombok.extern.slf4j.Slf4j;


@Service
@Slf4j
public class ProductService {
	
	@Autowired
	private ProductRepo prepo;

	public void createProduct(ProductRequest pr) {
	Product p=new Product();
	p.setName(pr.getName());
	p.setDesc(pr.getDesc());
	p.setPrice(pr.getPrice());
	prepo.save(p);
//	log.info("product is saved");
	}

	public List<ProductResponse> getAllProducts() {
		// TODO Auto-generated method stub
		List<Product>ps=prepo.findAll();
		List<ProductResponse> prs=ps.stream().map(product->mapToProductResponse(product)).toList();
		return prs;
	}

	private ProductResponse mapToProductResponse(Product product) {
		ProductResponse p=new ProductResponse();
		p.setId(product.getId());
		p.setDesc(product.getDesc());
		p.setName(product.getName());
		p.setPrice(product.getPrice());
		return p;
	}

}
