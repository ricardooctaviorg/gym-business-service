package com.rorg.gym.business.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.rorg.gym.commons.domain.business.PeriodicityPayment;


@RepositoryRestResource(path="periodicityPayment", exported = false)
public interface IPeriodicityPaymentDAO extends CrudRepository<PeriodicityPayment, Long> {

}
