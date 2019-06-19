package com.tp.web.control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TPControl {

	@RequestMapping("/welcome")
	public String welcome() {
		return "Hello";
	}

}
