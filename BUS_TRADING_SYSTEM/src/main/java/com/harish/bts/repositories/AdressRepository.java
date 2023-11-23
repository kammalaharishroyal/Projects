package com.harish.bts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.harish.bts.entity.Adress;

@Repository
public interface AdressRepository extends JpaRepository<Adress, Integer> {

}
