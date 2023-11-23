package com.harish.bts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.harish.bts.entity.Bus;

@Repository
public interface BusRepository extends JpaRepository<Bus, Integer> {

	Bus findByNumber(int bid);

}
