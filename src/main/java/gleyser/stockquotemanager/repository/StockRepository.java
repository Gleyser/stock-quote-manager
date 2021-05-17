package gleyser.stockquotemanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import gleyser.stockquotemanager.model.Stock;

public interface StockRepository extends JpaRepository<Stock, String> {

}
