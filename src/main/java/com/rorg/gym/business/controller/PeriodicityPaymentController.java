package com.rorg.gym.business.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rorg.gym.business.service.IPeriodicityPaymentService;
import com.rorg.gym.commons.controller.CommonController;
import com.rorg.gym.commons.domain.business.PeriodicityPayment;

@RestController
@RequestMapping("/peridodicityPaymentCatalog")
public class PeriodicityPaymentController extends CommonController<PeriodicityPayment, IPeriodicityPaymentService> {
	
	/*@Autowired
	private IPeriodicityPaymentService iPeriodicityPaymentService;
	
	@GetMapping
	public Iterable<PeriodicityPayment> findAllPeriodicityPayment(){
		return this.iPeriodicityPaymentService.findAllPeriodicityPayment();
	}*/
	
}
