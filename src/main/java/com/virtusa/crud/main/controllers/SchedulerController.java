package com.virtusa.crud.main.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.virtusa.crud.main.schedulers.ControlledScheduledTask;

@RestController
@RequestMapping("/scheduler")
public class SchedulerController {

	@Autowired
	private ControlledScheduledTask task;

	@PostMapping("/enable")
	public String enableScheduler() {
		task.setEnabled(true);
		return "Scheduler enabled.";
	}

}
