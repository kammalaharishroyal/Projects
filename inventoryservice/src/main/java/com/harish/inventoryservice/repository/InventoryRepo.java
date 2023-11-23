package com.harish.inventoryservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harish.inventoryservice.Entity.InventoryEntity;

public interface InventoryRepo  extends JpaRepository<InventoryEntity,Long>{

	Optional<InventoryEntity> findBySkuCode(String skucode);

}
