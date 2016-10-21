package com.zoudys.transport.metier;

import java.util.List;

import com.zoudys.transport.entities.*;

public interface CarDriverMetier {

	public List<CarDriver> listAllCarDriver();
	public CarDriver addCarDriver(CarDriver carDriver);
	public CarDriver updateCarDriver(Long idCarDriver, CarDriver carDriver);
	public boolean deleteCarDriver(Long idCarDriver);
	public CarDriver getCarDriver(CarDriver carDriver);
	public CarDriver findCarDriverByKeyword(String keyword);
	
	public List<CarDriver> findCarDriversByAgency(Agency agency);
	public CarDriver findCarDriverByBus(Bus bus);
	
}
