package com.luv2code.springboot.cruddemo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;

@Configuration
public class SecurityConfiguration {

    @Bean
    public InMemoryUserDetailsManager userDetailsManager(){

        UserDetails ranjith = User.builder()
                .username("ranjith")
                .password("{noop}test123")
                .roles("EMPLOYEE")
                .build();

        UserDetails rachana = User.builder()
                .username("rachana")
                .password("{noop}test")
                .roles("EMPLOYEE", "MANAGER")
                .build();

        UserDetails nivi = User.builder()
                .username("nivi")
                .password("{noop}test")
                .roles("EMPLOYEE", "MANAGER", "ADMIN")
                .build();

        return new InMemoryUserDetailsManager(ranjith, rachana,nivi);
    }
}
