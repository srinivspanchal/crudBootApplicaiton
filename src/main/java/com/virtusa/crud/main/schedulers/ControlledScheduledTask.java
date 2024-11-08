package com.virtusa.crud.main.schedulers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.virtusa.crud.main.entity.Product;
import com.virtusa.crud.main.services.ProductService;

@Component
public class ControlledScheduledTask {

	private boolean enabled = true;
	@Autowired
	private ProductService service;

	 @Scheduled(fixedRate = 5000) //  5 seconds
	    public void performTask() {
		 
		 Product product= new Product();
		 service.saveProduct(product);
	        if (enabled) {
	            System.out.println("Controlled Task executed at " + java.time.LocalDateTime.now());
	        }
	    }

	    public void setEnabled(boolean enabled) {
	        this.enabled = enabled;
	    }
	
}
