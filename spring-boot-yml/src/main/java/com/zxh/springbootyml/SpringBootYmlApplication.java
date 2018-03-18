package com.zxh.springbootyml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = "classpath:bean.xml")
public class SpringBootYmlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootYmlApplication.class, args);
	}
}
