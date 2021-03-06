package com.scipionyx.butterflyeffect.backend.stocks.main.services.valuable;

import org.springframework.stereotype.Component;

import com.scipionyx.butterflyeffect.api.infrastructure.services.server.data.AbstractJpaAccessService;
import com.scipionyx.butterflyeffect.api.stocks.model.valuable.CryptoCurrency;
import com.scipionyx.butterflyeffect.api.stocks.services.valuable.data.ICryptoCurrencyRepository;

/**
 *
 * 
 * @author Renato Mendes
 *
 */
@Component
public class CryptoCurrencyService extends AbstractJpaAccessService<CryptoCurrency, ICryptoCurrencyRepository> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
