package gleyser.stockquotemanager.controller;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import gleyser.stockquotemanager.exception.StockNotFoundException;
import gleyser.stockquotemanager.model.Stock;
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
	
	@GetMapping("/{id}")
	public Stock getStockById(@PathVariable String id) throws StockNotFoundException {
		return this.stockService.getStockById(id);
	}
	
	@PostMapping("/newquotation")
	public Stock addQuotation(@RequestParam(value="id", required=true) String id,
			@RequestParam(value="date", required=true) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date,
			@RequestParam(value="price", required=true) BigDecimal price) throws StockNotFoundException {
		return this.stockService.addQuotation(id, date, price);
	}
}
