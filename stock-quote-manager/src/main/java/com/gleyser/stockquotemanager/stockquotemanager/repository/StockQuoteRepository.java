package com.gleyser.stockquotemanager.stockquotemanager.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gleyser.stockquotemanager.stockquotemanager.model.StockQuote;

public interface StockQuoteRepository extends JpaRepository<StockQuote, Long> {

	List<StockQuote> FindbyIdStockQuote();

}