package gleyser.stockquotemanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import gleyser.stockquotemanager.model.Stock;
import gleyser.stockquotemanager.repository.StockRepository;
import gleyser.stockquotemanager.service.StockService;

@RestController
@RequestMapping("stock")
public class StockController {

	@Autowired
	private StockService stockService;

	@GetMapping
	public List<Stock> getAllStock() {		
		return this.stockService.findAll();

	}
}
