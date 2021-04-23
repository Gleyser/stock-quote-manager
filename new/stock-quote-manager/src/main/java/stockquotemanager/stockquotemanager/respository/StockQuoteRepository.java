package stockquotemanager.stockquotemanager.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import stockquotemanager.stockquotemanager.model.StockQuote;

public interface StockQuoteRepository extends JpaRepository<StockQuote, Long> {

}
