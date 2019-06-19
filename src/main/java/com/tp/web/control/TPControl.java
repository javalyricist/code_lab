package com.tp.web.control;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TPControl {

	Logger LOG = LoggerFactory.getLogger(TPControl.class);

	@RequestMapping("/welcome")
	public String welcome() {
		LOG.info("called welcome");
		return "Hello";
	}

}
