package com.izmo.spring_cloud.currecy_exchange_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.izmo.spring_cloud.currecy_exchange_service.entity.CurrencyExchange;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long>{

	public CurrencyExchange findByFromAndTo(String from, String to);
}
