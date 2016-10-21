package com.zoudys.transport.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 
 * @author urbain
 * This object represent global data about the CarDriver
 * 
 * @date 20/10/2016
 * @version VT 001
 */
@Entity
public class CarDriver  implements Serializable {

	// identify of car driver
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idCarDriver;
	
	// first name of car driver
	private String firstName;
	
	// last name of car driver
	private String lastName;
	
	// date of birth of car driver
	@Temporal(TemporalType.DATE)
	private Date dob;
	
	// bus, a car driver HAS one bus
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idBus", nullable=false)
	private Bus bus;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idAgency", nullable=false)
	private Agency agency;

	public Long getIdCarDriver() {
		return idCarDriver;
	}

	public void setIdCarDriver(Long idCarDriver) {
		this.idCarDriver = idCarDriver;
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

	public Bus getBus() {
		return bus;
	}

	public void setBus(Bus bus) {
		this.bus = bus;
	}

	// constructor from superclass
	public CarDriver() {
	}

	// constructor using fields
	public CarDriver(Long idCarDriver, String firstName, String lastName,
			Date dob) {
		this.idCarDriver = idCarDriver;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
	}
	
}
