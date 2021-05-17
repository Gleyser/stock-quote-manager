package gleyser.stockquotemanager.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class StockNotFoundException extends Exception{	
	public StockNotFoundException(String id)  {
        super("Stock not found with id: " + id);
    }

}
