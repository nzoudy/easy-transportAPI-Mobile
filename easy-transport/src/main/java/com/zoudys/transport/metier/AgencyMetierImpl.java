package com.zoudys.transport.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoudys.transport.entities.Agency;
import com.zoudys.transport.repositories.AgencyRepository;

@Service
public class AgencyMetierImpl implements AgencyMetier{
	
	@Autowired
	private AgencyRepository agencyRepository;

	@Override
	public List<Agency> listAllAgency() {
		return agencyRepository.findAll();
	}

	@Override
	public Agency addAgency(Agency agency) {
		if(agency == null){
			throw new RuntimeException("Agence introuvable"); 
		}
		return agencyRepository.save(agency);
	}

	@Override
	public Agency updateAgency(Long idAgency, Agency agency) {
		Agency ag = getAgency(idAgency);
		ag.setAddress(agency.getAddress());
		ag.setBuses(agency.getBuses());
		ag.setCarDrivers(agency.getCarDrivers());
		ag.setCity(agency.getCity());
		ag.setIdAgency(agency.getIdAgency());
		ag.setManagerOfAgency(agency.getManagerOfAgency());
		ag.setNameOfAgency(agency.getNameOfAgency());
		return ag;
	}

	@Override
	public Agency getAgency(Long idAgency) {
		return agencyRepository.findOne(idAgency);
	}

	@Override
	public boolean deleteAgency(Long idAgency) {
		agencyRepository.delete(idAgency);
		return true;
	}

	@Override
	public Agency findAgencyByKeyword(String keyword) {
		return agencyRepository.findAgencyByKeyword(keyword);
	}
	 
}
