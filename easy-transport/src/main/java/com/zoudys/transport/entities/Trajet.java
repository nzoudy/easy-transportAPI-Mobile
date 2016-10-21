package com.zoudys.transport.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * 
 * @author urbain
 * This object represent global data about the Trajet
 * 
 * @date 20/10/2016
 * @version VT 001
 */
@Entity
public class Trajet  implements Serializable {

	// identify of car ride, could be a string
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idTrajet;
	
	// duration
	private int duration;
	
	// info driver, a car ride about car driver
	@ManyToOne( fetch= FetchType.LAZY)
	@JoinColumn(name="idCarDriver", nullable=false)
	private CarDriver carDriver;
	
	// bus info, a car ride done by one or more buses
	@OneToMany(mappedBy="trajet", fetch=FetchType.LAZY)
	private Collection<Bus> buses;

	public Long getIdTrajet() {
		return idTrajet;
	}

	public void setIdTrajet(Long idTrajet) {
		this.idTrajet = idTrajet;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public CarDriver getCarDriver() {
		return carDriver;
	}

	public void setCarDriver(CarDriver carDriver) {
		this.carDriver = carDriver;
	}

	public Collection<Bus> getBuses() {
		return buses;
	}

	public void setBuses(Collection<Bus> buses) {
		this.buses = buses;
	}

	// constructor from superclass
	public Trajet() {
	}

	// constructor using fields
	public Trajet(Long idTrajet, int duration) {
		super();
		this.idTrajet = idTrajet;
		this.duration = duration;
	}

}
