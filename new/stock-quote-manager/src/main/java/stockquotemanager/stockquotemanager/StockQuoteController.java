package stockquotemanager.stockquotemanager;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockQuoteController {
	
	@RequestMapping("/")
	public String home() {
		return "ok";
	}
	

}
