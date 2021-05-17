package gleyser.stockquotemanager.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MapKeyColumn;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Stock {
	
	@Id
	private String id;	
	
	@ElementCollection	
	@MapKeyColumn(name="quote_ID")
	@Column(name="quotes")
	private Map<LocalDate, BigDecimal> quotes = new HashMap<LocalDate, BigDecimal>();

	
	

}
