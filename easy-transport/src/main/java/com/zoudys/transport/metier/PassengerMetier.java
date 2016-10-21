package com.zoudys.transport.metier;

import java.util.List;
import com.zoudys.transport.entities.*;

public interface PassengerMetier {

	public List<Passenger> listAllPassengers();
	public Passenger addPassenger(Passenger passenger);
	public Passenger updatePassenger(Long idPassenger, Passenger passenger);
	public boolean deletePassenger(Long idPassenger);
	public Passenger getPassenger(Long idPassenger);
	public Passenger findPassengerByKeyword(String keyword);
	
	public List<Passenger> findPassengerByBus(Bus bus);
	public List<Passenger> findPassengerByTicket(Ticket ticket);
	
}
