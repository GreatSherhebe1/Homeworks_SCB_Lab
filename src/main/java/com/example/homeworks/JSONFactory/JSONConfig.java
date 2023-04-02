package com.example.homeworks.JSONFactory;

import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JSONConfig {

    @Bean
    public JSONCreator createjson() throws JSONException {
        return new JSONCreator();
    }
}
