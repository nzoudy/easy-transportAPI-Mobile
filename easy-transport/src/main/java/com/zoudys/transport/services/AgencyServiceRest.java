package com.zoudys.transport.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.zoudys.transport.entities.Agency;
import com.zoudys.transport.metier.AgencyMetier;

@RestController
public class AgencyServiceRest {
	
	@Autowired
	private AgencyMetier agencyMetier;
	
	@RequestMapping(value="/agencies", method=RequestMethod.GET)
	public List<Agency> listAllAgency(){
		return agencyMetier.listAllAgency();
	}
	
	@RequestMapping(value="/agency", method=RequestMethod.POST)
	@ResponseBody
	public Agency addAgency(@RequestBody Agency agency){		
		return agencyMetier.addAgency(agency);
	}
	
	@RequestMapping(value="/agency/{idAgency}", method=RequestMethod.PUT)
	public Agency updateAgency(@RequestParam(value="idAgency") Long idAgency, Agency agency) {
		return agencyMetier.updateAgency(idAgency, agency);
	}
	
	@RequestMapping(value="/agencies/{idAgency}", method=RequestMethod.GET)
	@ResponseBody
	public Agency getAgency(@RequestParam(value="idAgency") Long idAgency) {
		return agencyMetier.getAgency(idAgency);
	}
	
	@RequestMapping(value="/agencies/{idAgency}", method=RequestMethod.DELETE)
	public boolean deleteAgency(@RequestParam(value="idAgency") Long idAgency) {
		agencyMetier.deleteAgency(idAgency);
		return true;
	}

	@RequestMapping(value="/agencykw", method=RequestMethod.GET)
	@ResponseBody
	public Agency findAgencyByKeyword(@RequestParam("keyword")String keyword) {
		return agencyMetier.findAgencyByKeyword(keyword);
	}
	
	
	
}
