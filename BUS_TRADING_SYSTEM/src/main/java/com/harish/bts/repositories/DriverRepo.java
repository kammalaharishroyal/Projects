package com.harish.bts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harish.bts.entity.Driver;

public interface DriverRepo extends JpaRepository<Driver, Integer> {

}
