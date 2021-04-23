package gleyser.stockquotemanager.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Stock {
	
	@Id
	private String id;	
	
	@OneToMany
	@JoinColumn(name = "stock_id")
	private List<Quotation> quotations = new ArrayList<Quotation>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Quotation> getQuotations() {
		return quotations;
	}

	public void setQuotations(List<Quotation> quotations) {
		this.quotations = quotations;
	}	
	
	

}
