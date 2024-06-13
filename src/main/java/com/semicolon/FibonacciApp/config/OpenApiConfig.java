package com.semicolon.FibonacciApp.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API Title")
                        .version("1.0")
                        .description("API Description")
                        .termsOfService("http://swagger.io/terms/")
                        .contact(new Contact().name("API Support").url("http://www.example.com/support").email("support@example.com"))
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")));

    }
}
