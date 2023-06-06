package com.be.config;

import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@OpenAPIDefinition
@Configuration
public class OpenAPIConfig {
    public OpenAPI OpenAPI() {
        Info info = new Info()
                .title("Future")
                .version("1.0.0")
                .description("This API exposes endpoints to manage decoration shop.");

        return new OpenAPI().info(info);
    }
}
