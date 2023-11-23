package com.harish.inventoryservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.harish.inventoryservice.repository.InventoryRepo;

@Service
public class InventoryService {
	
	@Autowired
	private InventoryRepo irepo;
	
	@Transactional(readOnly = true)
	public boolean isInStock(String skucode) {
		
		return irepo.findBySkuCode(skucode).isPresent();
	}
	

}
