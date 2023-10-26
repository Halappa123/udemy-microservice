package com.zkteco.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zkteco.limitsservice.bean.Limits;
import com.zkteco.limitsservice.configuration.Configuration;

@RestController
@RequestMapping("/api")
public class LimitsController {
	
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	private Limits retriveLimits() {
		return new Limits(configuration.getMinimum(), configuration.getMaximum());
	//	return new Limits(1,1000);
	}

}
