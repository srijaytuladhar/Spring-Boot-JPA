package com.spring.restapi.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
public class RestapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestapiApplication.class, args);
	}

	@RequestMapping(value = "/")
	public ResponseEntity<Object> homePage() {
		return new ResponseEntity<>("<h2>JPA using Apache Derby</h2>Use " +
				"<a href='students'><b>localhost:8080<i>/students</i></b></a>", HttpStatus.OK);
	}
}
