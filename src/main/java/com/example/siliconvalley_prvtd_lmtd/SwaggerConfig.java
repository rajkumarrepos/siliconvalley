//package com.example.siliconvalley_prvtd_lmtd;
//
//
//import io.swagger.v3.oas.models.OpenAPI;
//import io.swagger.v3.oas.models.info.Info;
//import lombok.extern.slf4j.Slf4j;
//import org.springdoc.core.models.GroupedOpenApi;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.service.ApiKey;
//@Slf4j
//@Configuration
//public class SwaggerConfig {
//
//    private ApiKey apiKey() {
//        return new ApiKey("jwtToken", "Authorization", "header");
//    }
//
//    @Bean
//    public GroupedOpenApi publicApi() {
//        return GroupedOpenApi.builder()
//                .group("springshop-public")
//                .pathsToMatch("/**")
//                .build();
//    }
//
//    @Bean
//    public OpenAPI customOpenAPI() {
//        return new OpenAPI()
//                .info(new Info().title("Facility Registry").version("1.0.0"));
//    }
//
//
//
//
//}
//
