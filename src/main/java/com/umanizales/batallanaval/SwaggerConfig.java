package com.umanizales.batallanaval;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket BatallaNavalDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("BatallaNaval")
                .select()
                .apis(RequestHandlerSelectors.basePackage(
                        "com.umanizales.batallanaval.controller"))
                .paths(PathSelectors.any()).build()
                .apiInfo(getApiInfo());
    }

    //Agregar método información o documentación de mi api
    private ApiInfo getApiInfo() {
        return new ApiInfo(
                "API Batalla Naval Lista SE ",
                "Api que permite gestionar todo el backend de listas SE y DE",
                "1.0",
                "http://www.umanizales.com/",
                new Contact("Oscar", "http://www.umanizales.edu.co/",
                        "oscarj5647@gmail.com"),
                "LICENSE",
                "LICENSE URL",
                Collections.emptyList()
        );
    }
}