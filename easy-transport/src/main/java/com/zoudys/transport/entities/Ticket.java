package com.zoudys.transport.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 
 * @author urbain
 * This object represent global data about the Ticket
 * 
 * @date 20/10/2016
 * @version VT 001
 */
@Entity
public class Ticket  implements Serializable {

	// ticket number could be a String
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long ticketNumber;
	
	// price of ticket
	private double price;
	
	// departure date
	@Temporal(TemporalType.TIMESTAMP)
	private Date departure;
	
	// arrival date 
	@Temporal(TemporalType.TIMESTAMP)
	private Date arrival;
	
	// ticket is valid or not
	private boolean isValid;
	
	// trajet
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idTrajet", nullable=false)
	private Trajet trajet;
	
	// list of passengers on ticket
	@OneToMany(mappedBy="ticket", fetch=FetchType.LAZY)
	private Collection<Passenger> passengers;

	public Long getTicketNumber() {
		return ticketNumber;
	}

	public void setTicketNumber(Long ticketNumber) {
		this.ticketNumber = ticketNumber;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getDeparture() {
		return departure;
	}

	public void setDeparture(Date departure) {
		this.departure = departure;
	}

	public Date getArrival() {
		return arrival;
	}

	public void setArrival(Date arrival) {
		this.arrival = arrival;
	}

	public boolean isValid() {
		return isValid;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}

	public Trajet getTrajet() {
		return trajet;
	}

	public void setTrajet(Trajet trajet) {
		this.trajet = trajet;
	}

	public Collection<Passenger> getPassengers() {
		return passengers;
	}

	public void setPassengers(Collection<Passenger> passengers) {
		this.passengers = passengers;
	}

	// constructor from superclass
	public Ticket() {
	}

	// constructor using fields
	public Ticket(Long ticketNumber, double price, Date departure,
			Date arrival, boolean isValid) {
		this.ticketNumber = ticketNumber;
		this.price = price;
		this.departure = departure;
		this.arrival = arrival;
		this.isValid = isValid;
	}
	
	
}
