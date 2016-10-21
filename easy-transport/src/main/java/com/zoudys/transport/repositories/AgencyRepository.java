package com.zoudys.transport.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.zoudys.transport.entities.Agency;

public interface AgencyRepository extends JpaRepository<Agency, Long>  {

	@Query("select ag from Agency ag where ag.nameOfAgency=:kw")
	public Agency findAgencyByKeyword(@Param("kw") String keyword);
}
