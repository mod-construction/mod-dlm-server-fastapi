package org.openapitools.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.security.SecurityScheme;

@Configuration
public class SpringDocConfiguration {

    @Bean(name = "org.openapitools.configuration.SpringDocConfiguration.apiInfo")
    OpenAPI apiInfo() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("mod-dlm API")
                                .description("mod-dlm is an open source domain specific language to describe prefab construction elements. This project provides tools for defining entity models and automatically generating CRUD APIs, enabling suppliers to create and manage catalogs of their products easily.")
                                .contact(
                                        new Contact()
                                                .name("Contact us")
                                                .url("https://mod.construction")
                                                .email("info@mod.construction")
                                )
                                .license(
                                        new License()
                                                .name("MIT")
                                                .url("https://github.com/mod-construction/mod-dlm/blob/main/LICENSE")
                                )
                                .version("1.0.7")
                )
                .components(
                        new Components()
                                .addSecuritySchemes("apiKey", new SecurityScheme()
                                        .type(SecurityScheme.Type.APIKEY)
                                        .in(SecurityScheme.In.HEADER)
                                        .name("X-API-KEY")
                                )
                                .addSecuritySchemes("bearer", new SecurityScheme()
                                        .type(SecurityScheme.Type.HTTP)
                                        .scheme("bearer")
                                        .bearerFormat("JWT")
                                )
                )
        ;
    }
}