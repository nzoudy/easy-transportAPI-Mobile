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
 * This object represent global data about the Bus
 * 
 * @date 20/10/2016
 * @version VT 001
 */
@Entity
public class Bus  implements Serializable {

	// registration = immatriculation
	@Id
	private String registration;
	
	// NUMBER_OF__PLACE_MAX, nombre de place max dans le bus
	private static int NUMBER_OF__PLACE_MAX;
	
	// date Mise En Circulation
	@Temporal(TemporalType.DATE)
	private Date dateSetInCirculation;
	
	// conducteur, a bus HAS at least one car driver
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idCarDriver",nullable=false)
	private CarDriver carDriver;
	
	// trajet, a bus HAS at least one trajet
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idTrajet", nullable=false)
	private Trajet trajet;
	
	// agency info
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idAgency")
	private Agency agency;
	
	// passengers list of bus 
	@OneToMany(mappedBy="bus")
	private Collection<Passenger> passengers;

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	public static int getNUMBER_OF__PLACE_MAX() {
		return NUMBER_OF__PLACE_MAX;
	}

	public static void setNUMBER_OF__PLACE_MAX(int nUMBER_OF__PLACE_MAX) {
		NUMBER_OF__PLACE_MAX = nUMBER_OF__PLACE_MAX;
	}

	public Date getDateSetInCirculation() {
		return dateSetInCirculation;
	}

	public void setDateSetInCirculation(Date dateSetInCirculation) {
		this.dateSetInCirculation = dateSetInCirculation;
	}

	public CarDriver getCarDriver() {
		return carDriver;
	}

	public void setCarDriver(CarDriver carDriver) {
		this.carDriver = carDriver;
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
	public Bus() {
	}
	
	// constructor using fields
	public Bus(String registration, Date dateSetInCirculation,
			CarDriver carDriver) {
		this.registration = registration;
		this.dateSetInCirculation = dateSetInCirculation;
		this.carDriver = carDriver;
	}
	
	
}
