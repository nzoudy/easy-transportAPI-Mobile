package com.zoudys.transport.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zoudys.transport.entities.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long> {

}
