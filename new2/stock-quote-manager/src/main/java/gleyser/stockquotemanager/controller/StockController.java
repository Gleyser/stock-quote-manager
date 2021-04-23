package gleyser.stockquotemanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import gleyser.stockquotemanager.model.Stock;
import gleyser.stockquotemanager.repository.StockRepository;

@RestController
public class StockController {

	@Autowired
	private StockRepository stockRepository;

	@RequestMapping("/")
	public String home() {
		return "home";
	}

	@RequestMapping("/all")
	public List<Stock> all() {
		return this.stockRepository.findAll();

	}
}
