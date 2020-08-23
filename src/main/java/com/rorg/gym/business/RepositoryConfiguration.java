package com.rorg.gym.business;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import com.rorg.gym.commons.domain.business.BusinessPackage;
import com.rorg.gym.commons.domain.business.BusinessService;
import com.rorg.gym.commons.domain.business.Inscription;
import com.rorg.gym.commons.domain.business.PeriodicityPayment;

@Configuration
public class RepositoryConfiguration implements RepositoryRestConfigurer{

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.exposeIdsFor(BusinessPackage.class
							, BusinessService.class
							, Inscription.class
							, PeriodicityPayment.class);
	}

}
