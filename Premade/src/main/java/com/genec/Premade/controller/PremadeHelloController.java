package com.genec.Premade.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PremadeHelloController {
	
	@RequestMapping(value = "/hello")
	@ResponseBody
	public String index() {
		return "Hello World";
	}

}
