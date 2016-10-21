package com.zoudys.transport.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zoudys.transport.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
