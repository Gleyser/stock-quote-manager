package gleyser.stockquotemanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

	public Stock getStockById(String id) {
		return this.stockRespository.findById(id).get();
	}
	
	
	

}
