package com.yisom.restful.oauthapi.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * com.yisom.restful.oauthapi.config
 *
 * @author : idasom
 * @data : 2024/01/02
 */
@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("open API 를 이용한 restful API")
                        .description("open API 를 이용한 restful API")
                        .version("1.0.0"));
    }
}
