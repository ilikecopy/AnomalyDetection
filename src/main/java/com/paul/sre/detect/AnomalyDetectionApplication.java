package com.paul.sre.detect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.paul.sre.detect")
public class AnomalyDetectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnomalyDetectionApplication.class, args);
	}

}
