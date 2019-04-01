package com.genec.Premade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.genec.Premade.controller"})
public class PremadeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PremadeApplication.class, args);
	}

}
