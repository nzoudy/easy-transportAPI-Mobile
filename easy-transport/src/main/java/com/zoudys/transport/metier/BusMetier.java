package com.zoudys.transport.metier;

import java.util.List;
import com.zoudys.transport.entities.*;

public interface BusMetier {

	public List<Bus> listAllBus();
	public Bus addBus(Bus bus);
	public Bus updateBus(String registration, Bus bus);
	public Bus getBus(String registration);
	public boolean deleteBus(String registration);
	public Bus findBusByKeyword(String keyword);
	
	public List<Bus> findBusesByAgency(Agency agency);
	public List<Bus> findBusesByTrajet(Trajet trajet);
	
}
