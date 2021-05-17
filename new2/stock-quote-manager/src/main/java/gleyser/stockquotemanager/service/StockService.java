package gleyser.stockquotemanager.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gleyser.stockquotemanager.exception.StockNotFoundException;
import gleyser.stockquotemanager.model.Stock;
import gleyser.stockquotemanager.repository.StockRepository;

@Service
public class StockService {
	
	@Autowired
	private StockRepository stockRespository;

	public List<Stock> findAll() {
		return this.stockRespository.findAll();
	}

	public Stock createStock(Stock stock) {
		return this.stockRespository.save(stock);
	}

	public Stock getStockById(String id) throws StockNotFoundException {
		return this.stockRespository.findById(id).orElseThrow( () -> new StockNotFoundException(id));
	}

	public Stock addQuotation(String id, LocalDate date, BigDecimal price) throws StockNotFoundException {
		Stock stock = getStockById(id);
		stock.addQuotation(date, price);
		this.stockRespository.save(stock);
		return stock;
	}
	
	
	

}
