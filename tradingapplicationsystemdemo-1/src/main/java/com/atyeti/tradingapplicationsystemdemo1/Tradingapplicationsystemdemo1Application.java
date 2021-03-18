package com.atyeti.tradingapplicationsystemdemo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })

public class Tradingapplicationsystemdemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Tradingapplicationsystemdemo1Application.class, args);
	}

}
