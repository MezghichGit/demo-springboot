package com.sip.ams;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class AmsApplication {
	@GetMapping(value="/")
	@ResponseBody
	public String home() {

		return "<h1 align=center>Hello Docker for Spring Project</h1>";
	}

	public static void main(String[] args) {
		SpringApplication.run(AmsApplication.class, args);
		System.out.println("Hello");
	}

}
