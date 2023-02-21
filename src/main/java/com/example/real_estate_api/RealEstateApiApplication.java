package com.example.real_estate_api;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RealEstateApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(RealEstateApiApplication.class, args);
	}

	@Bean
	public OpenAPI openApiConfig(){
		return new OpenAPI().info(apiInfo());
	}

	public Info apiInfo(){
		Info info = new Info();

		License lc = new License();
		lc.name("MIT");
		lc.url("https://choosealicense.com/licenses/mit/");

		return info
				.title("Real Estate API")
				.description("A Real Estate API made with Spring Boot, Jpa, Mysql and Hibernate")
				.license(lc)
				.version("v1");


	}
}
