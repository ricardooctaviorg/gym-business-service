package com.rorg.gym.business.service;

import org.springframework.stereotype.Service;

import com.rorg.gym.business.repository.IPeriodicityPaymentDAO;
import com.rorg.gym.commons.domain.business.PeriodicityPayment;
import com.rorg.gym.commons.service.CommonService;

@Service
public class PeriodicityPaymentService extends CommonService<PeriodicityPayment,IPeriodicityPaymentDAO > implements IPeriodicityPaymentService {
	
	/*@Autowired
	private IPeriodicityPaymentDAO iPeriodicityPaymentDAO;

	@Override
	@Transactional(readOnly = true)
	public Iterable<PeriodicityPayment> findAllPeriodicityPayment() {
		return iPeriodicityPaymentDAO.findAll();
	}*/

}
