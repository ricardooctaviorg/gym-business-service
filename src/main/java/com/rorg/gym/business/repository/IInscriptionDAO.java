package com.rorg.gym.business.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.rorg.gym.commons.domain.business.Inscription;

@RepositoryRestResource(path="inscription")
public interface IInscriptionDAO extends JpaRepository<Inscription, Long> {

}
