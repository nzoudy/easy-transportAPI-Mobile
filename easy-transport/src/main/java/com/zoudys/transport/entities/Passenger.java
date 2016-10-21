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
 * This object represent global data about the Passenger
 * 
 * @date 20/10/2016
 * @version VT 001
 */
@Entity
public class Passenger  implements Serializable {
	
	// passager identify
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idPassenger;
	
	// FirstName of passenger
	private String firstName;
	
	// LastName of passenger
	private String lastName;
	
	// Date of birth of passenger
	@Temporal(TemporalType.DATE)
	private Date dob;
	
	// Ticket of passenger
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idTicket", nullable=false)
	private Ticket ticket;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idBus", nullable=false)
	private Bus bus;

	public Long getIdPassenger() {
		return idPassenger;
	}

	public void setIdPassenger(Long idPassenger) {
		this.idPassenger = idPassenger;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	// constructor from superclass
	public Passenger() {
	}
	
	// constructor using fields
	public Passenger(Long idPassenger, String firstName, String lastName,
			Date dob) {
		this.idPassenger = idPassenger;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
	}
	
	
}
