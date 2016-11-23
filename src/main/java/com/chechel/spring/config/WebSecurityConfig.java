package com.chechel.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import static com.chechel.spring.UrlMapping.ADMIN;
import static com.chechel.spring.UrlMapping.HELLO;
import static com.chechel.spring.UrlMapping.LOGIN;
import static com.chechel.spring.UrlMapping.USER;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("user").password("password").roles("USER");
    }

    //@formatter:off
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                    .antMatchers(ADMIN).hasRole("ADMIN")
                    .antMatchers(USER).hasRole("USER")
                    .antMatchers(HELLO).permitAll()
                    .anyRequest().authenticated()
                .and()
                .formLogin()
                    .loginPage(LOGIN).permitAll();
    }
    //@formatter:on

}
