package com.virtusa.crud.main.schedulers;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ControlledScheduledTask {

	private boolean enabled = true;

	 @Scheduled(fixedRate = 5000) //  5 seconds
	    public void performTask() {
	        if (enabled) {
	            System.out.println("Controlled Task executed at " + java.time.LocalDateTime.now());
	        }
	    }

	    public void setEnabled(boolean enabled) {
	        this.enabled = enabled;
	    }
	
}
