package gleyser.stockquotemanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

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
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Stock createStock(@RequestBody Stock stock) {
		return this.stockService.createStock(stock);
	}
}
