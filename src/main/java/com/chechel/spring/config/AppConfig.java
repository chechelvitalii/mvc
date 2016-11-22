package com.chechel.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {"com.chechel.spring"})
@Import(value = {WebMvcConfig.class, WebSecurityConfig.class})
public class AppConfig {
}
