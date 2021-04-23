package com.gleyser.stockquotemanager.stockquotemanager.controller;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gleyser.stockquotemanager.stockquotemanager.repository.StockQuoteRepository;

@RestController
public class StockQuoteController {

	@Autowired
	private StockQuoteRepository stockQuoteRepository;
	
	@RequestMapping("/h")
	public String inicio() {
		return "teste";
	}

	

	
}
