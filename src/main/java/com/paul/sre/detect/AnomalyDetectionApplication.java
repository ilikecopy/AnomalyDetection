package com.paul.sre.detect;

/**
 *  License info: 
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @see@
 * @author win
 *
 */

@SpringBootApplication
@ComponentScan(basePackages = "com.paul.sre.detect")
public class AnomalyDetectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnomalyDetectionApplication.class, args);
	}

}
