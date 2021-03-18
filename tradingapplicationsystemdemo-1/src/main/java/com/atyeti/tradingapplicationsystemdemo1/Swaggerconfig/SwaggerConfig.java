package com.atyeti.tradingapplicationsystemdemo1.Swaggerconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.google.common.base.Predicates;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig extends WebMvcConfigurerAdapter{

	@Bean
	public Docket api() {
	// @formatter:off
	//Register the controllers to swagger
	//Also it is configuring the Swagger Docket
	return new Docket(DocumentationType.SWAGGER_2).select()
	// .apis(RequestHandlerSelectors.any())
	.apis(Predicates.not(RequestHandlerSelectors.basePackage("org.springframework.boot")))
	// .paths(PathSelectors.any())
	// .paths(PathSelectors.ant("/swagger2-demo"))
	.build()
	// @formatter:on
	.apiInfo(metaInfo());
    
	}
	 
	private ApiInfo metaInfo() {

	        ApiInfo apiInfo = new ApiInfo(
	            "Tradding Application",
	            null,
	            "1.0",
	            "Terms of Service",
	            new Contact("traders@gmail.com", null,
	                null),
	            "Apache License Version 2.0",
	            "https://www.apache.org/licenses/"
	        );

	        return apiInfo;
	    }
	

}
