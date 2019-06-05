package com.loafer.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Spring Security 会拦截swagger-ui.html 同样也会拦截api，这里将或略掉/api/下的所有子路径
 */
@EnableWebSecurity
@Configuration
class CustomWebSecurityConfigurerAdapter extends WebSecurityConfigurerAdapter {
    @Override
    public void configure(WebSecurity web) throws Exception {
        super.configure(web);
        web.ignoring().antMatchers("/api/v1/**");
    }
}

