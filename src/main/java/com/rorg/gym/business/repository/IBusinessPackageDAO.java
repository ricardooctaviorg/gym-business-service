package com.rorg.gym.business.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.rorg.gym.business.repository.inline.InlinePeriodicityPayment;
import com.rorg.gym.commons.domain.business.BusinessPackage;

@RepositoryRestResource(path="businessPackage", excerptProjection = InlinePeriodicityPayment.class)
public interface IBusinessPackageDAO extends JpaRepository<BusinessPackage, Long> {
	
	public Page<BusinessPackage> findByIdAccountAndStatus(Long idAccount, Integer status, Pageable pageable);
}
