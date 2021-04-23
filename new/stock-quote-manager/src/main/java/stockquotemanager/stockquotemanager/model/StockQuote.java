package stockquotemanager.stockquotemanager.model;

import java.util.ArrayList;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Repository;

@Repository
public class StockQuote {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private String idStockQuote;

	@OneToMany(mappedBy = "stockQuote")
    private ArrayList<Quotation> quotations;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIdStockQuote() {
		return idStockQuote;
	}

	public void setIdStockQuote(String idStockQuote) {
		this.idStockQuote = idStockQuote;
	}

	public ArrayList<Quotation> getQuotations() {
		return quotations;
	}

	public void setQuotations(ArrayList<Quotation> quotations) {
		this.quotations = quotations;
	}	
	
	public void addQuotation(Quotation quotation) {
		this.quotations.add(quotation);
	}

}

