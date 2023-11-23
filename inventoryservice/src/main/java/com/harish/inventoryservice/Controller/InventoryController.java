package com.harish.inventoryservice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.harish.inventoryservice.service.InventoryService;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController {
	
	@Autowired
	private InventoryService is;
	
	@GetMapping("/{skucode}")
	@ResponseStatus(code = HttpStatus.OK)
	public boolean isInStock(@PathVariable("skucode") String skucode) {
		return is.isInStock(skucode);
	}

}
