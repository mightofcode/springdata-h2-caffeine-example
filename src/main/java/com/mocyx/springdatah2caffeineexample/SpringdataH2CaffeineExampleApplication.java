package com.mocyx.springdatah2caffeineexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringdataH2CaffeineExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringdataH2CaffeineExampleApplication.class, args);
	}

}
