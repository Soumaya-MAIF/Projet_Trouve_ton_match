package fr.initiativedeuxsevres.ttm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;

@EnableWebSecurity
public class SpringSecurity {

    @Bean
    protected UserDetailsService userDetailsService(){

    }
}