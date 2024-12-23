package com.izmo.spring_cloud.currecy_exchange_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.izmo.spring_cloud.currecy_exchange_service.entity.CurrencyExchange;
import com.izmo.spring_cloud.currecy_exchange_service.repository.CurrencyExchangeRepository;

@RestController
public class CurrencyExchangeController {
	
	@Autowired
	private Environment environment;
	
	@Autowired
	private CurrencyExchangeRepository repository;
	
	@GetMapping("currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange retriveExchangeValue(@PathVariable String from, @PathVariable String to)
	{
		
		CurrencyExchange currencyExchange = repository.findByFromAndTo(from, to);
		
		if(currencyExchange == null)
		{
			throw new RuntimeException("Unnable to find Data for "+from+" To "+to);
		}
		
		currencyExchange.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		return currencyExchange;
	}
}
