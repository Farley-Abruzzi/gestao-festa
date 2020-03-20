package com.algaworks.festa.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth
			.inMemoryAuthentication()
			.withUser("farley").password("{noop}password").roles("USER")
			.and()
			.withUser("root").password("{noop}password").roles("USER")
			.and()
			.withUser("admin").password("{noop}password").roles("USER");
	}

}
