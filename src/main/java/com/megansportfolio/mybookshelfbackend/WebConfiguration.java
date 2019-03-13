package com.megansportfolio.mybookshelfbackend;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebConfiguration {

    @Bean
    public WebMvcConfigurer corsConfigurer(){
        return new WebMvcConfigurerAdapter(){
            @Override
            public void addCorsMappings(CorsRegistry registry){
                registry.addMapping("/shelves/**").allowedOrigins("http://localhost:4200");
                registry.addMapping("/comments").allowedOrigins("http://localhost:4200");
                registry.addMapping("/books/**").allowedOrigins("http://localhost:4200");
            }
        };
    }

}
