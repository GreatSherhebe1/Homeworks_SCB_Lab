package com.example.homeworks.config;

import com.example.homeworks.beans.rank.Communist;
import com.example.homeworks.beans.rank.Comsomol;
import com.example.homeworks.beans.rank.Marxist;
import com.example.homeworks.beans.rank.Pioner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class CommunistConfig {

    @Bean
    @Scope
    public Communist pioner(){
        return new Pioner();
    }

    @Bean
    @Scope
    public Communist comsomol(){
        return new Comsomol();
    }

    @Bean
    @Scope
    public Communist marxist(){
        return new Marxist();
    }
}
