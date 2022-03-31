package com.simplilearn;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

	@GetMapping("/welcome")
	public String index() {
		return "Deploy SpringBoot with Aws........!";
	}

}
