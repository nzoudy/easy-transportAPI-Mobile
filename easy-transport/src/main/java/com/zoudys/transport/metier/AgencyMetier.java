package com.zoudys.transport.metier;

import com.zoudys.transport.entities.Agency;
import java.util.List;

public interface AgencyMetier {

	public List<Agency> listAllAgency();
	public Agency addAgency(Agency agency);
	public Agency updateAgency(Long idAgency, Agency agency);
	public Agency getAgency(Long idAgency);
	public boolean deleteAgency(Long idAgency);
	public Agency findAgencyByKeyword(String keyword);
}
