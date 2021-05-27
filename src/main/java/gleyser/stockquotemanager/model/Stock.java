package gleyser.stockquotemanager.model;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MapKeyColumn;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;


@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Stock {
	
	@Id
	private String id;	
	
	@ElementCollection	
	@MapKeyColumn(name="quote_ID")
	@Column(name="quotes")
	private Map<LocalDate, BigDecimal> quotes = new HashMap<LocalDate, BigDecimal>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Map<LocalDate, BigDecimal> getQuotes() {
		return quotes;
	}

	public void setQuotes(Map<LocalDate, BigDecimal> quotes) {
		this.quotes = quotes;
	}	
	
	public void addQuotation(LocalDate date, BigDecimal price) {
		this.quotes.put(date, price);
	}
	
	
	
	

}
