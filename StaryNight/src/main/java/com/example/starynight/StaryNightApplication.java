package com.example.starynight;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class StaryNightApplication {

	public static void main(String[] args) {
		SpringApplication.run(StaryNightApplication.class, args);
	}

}
