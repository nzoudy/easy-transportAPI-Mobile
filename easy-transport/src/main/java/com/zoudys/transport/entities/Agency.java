package com.zoudys.transport.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * 
 * @author urbain
 * This object represent global data about the Agency
 * 
 * @date 20/10/2016
 * @version VT 001
 */
@Entity
public class Agency implements Serializable {

	// identify of agency
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idAgency;
	
	// manager of agency
	private String managerOfAgency;
	
	// name of agency
	private String nameOfAgency;
	
	// address of agency
	private String address;
	
	// city of agency, because we can have more than one agency in one city
	private String city;
	
	// list of buses in an agency
	@OneToMany(mappedBy="agency")
	private Collection<Bus> buses;
	
	// list of CarDriver in an agency
	@OneToMany(mappedBy="agency")
	private Collection<CarDriver> carDrivers;

	public Long getIdAgency() {
		return idAgency;
	}

	public void setIdAgency(Long idAgency) {
		this.idAgency = idAgency;
	}

	public String getManagerOfAgency() {
		return managerOfAgency;
	}

	public void setManagerOfAgency(String managerOfAgency) {
		this.managerOfAgency = managerOfAgency;
	}

	public String getNameOfAgency() {
		return nameOfAgency;
	}

	public void setNameOfAgency(String nameOfAgency) {
		this.nameOfAgency = nameOfAgency;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@JsonIgnore
	public Collection<Bus> getBuses() {
		return buses;
	}

	@JsonSetter
	public void setBuses(Collection<Bus> buses) {
		this.buses = buses;
	}

	@JsonIgnore
	public Collection<CarDriver> getCarDrivers() {
		return carDrivers;
	}

	@JsonSetter
	public void setCarDrivers(Collection<CarDriver> carDrivers) {
		this.carDrivers = carDrivers;
	}
	
	// constructor from superclass
	public Agency() {
	}
	
	// constructor using fields
	public Agency(Long idAgency, String managerOfAgency, String nameOfAgency,
			String address, String city) {
		this.idAgency = idAgency;
		this.managerOfAgency = managerOfAgency;
		this.nameOfAgency = nameOfAgency;
		this.address = address;
		this.city = city;
	}
	
	
}
