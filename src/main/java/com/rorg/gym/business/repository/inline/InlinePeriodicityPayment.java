package com.rorg.gym.business.repository.inline;

import java.util.Date;

import org.springframework.data.rest.core.config.Projection;

import com.rorg.gym.commons.domain.business.BusinessPackage;
import com.rorg.gym.commons.domain.business.PeriodicityPayment;

@Projection(name = "inlinePeriodicityPayment", types = { BusinessPackage.class })
public interface InlinePeriodicityPayment {
	
	Long getIdBusinessPackage();
	Long getIdAccount();
	Long getIdUserCreate();
	PeriodicityPayment getIdPeriodicityPayment();
	String getNamePackage();
	Integer getCoverage();
	Date getDateCreate();
	Date getToDateValid();
	Date getFromDateValid();
	Double getCost();
	Integer getStatus();
}
