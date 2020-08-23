package com.rorg.gym.business.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.rorg.gym.commons.domain.business.BusinessService;

@RepositoryRestResource(path="businessService")
public interface IBusinessServiceDAO extends JpaRepository<BusinessService, Long> {

}
