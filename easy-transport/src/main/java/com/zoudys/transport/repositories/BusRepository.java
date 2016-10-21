package com.zoudys.transport.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zoudys.transport.entities.Bus;

public interface BusRepository extends JpaRepository<Bus, String> {

}
