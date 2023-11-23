package com.harish.inventoryservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.harish.inventoryservice.Entity.InventoryEntity;
import com.harish.inventoryservice.repository.InventoryRepo;

@SpringBootApplication
public class InventoryserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryserviceApplication.class, args);

		
	}
	
	
	@Bean
	public CommandLineRunner loadData(InventoryRepo irepo) {
		return args->{
			InventoryEntity ie=new InventoryEntity();
			ie.setSkuCode("iphone-13");
			ie.setQuantity(100);
			InventoryEntity ie1=new InventoryEntity();
			ie1.setSkuCode("iphone-13-red");
			ie1.setQuantity(0);
			irepo.save(ie1);
			irepo.save(ie);
		};
	}

}
