package com.piotrn.thymeleaf1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

//@SpringBootApplication(exclude = { SecurityAutoConfiguration.class, DataSourceAutoConfiguration.class })
@SpringBootApplication
@EnableJpaAuditing
public class Thymeleaf1Application {

	public static void main(String[] args) {
		SpringApplication.run(Thymeleaf1Application.class, args);

	}

}
