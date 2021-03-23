package org.maxkey.springboot.oauthclient.config;

import org.maxkey.springboot.oauthclient.HttpsTrusts;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
@EnableOAuth2Sso
public class ResourceServerConfiguration extends WebSecurityConfigurerAdapter {
    @Override
    public void configure(HttpSecurity http) throws Exception {
       //http.antMatcher("/orgs/**").antMatcher("/userinfo").antMatcher("/login").authorizeRequests().anyRequest().authenticated();
    	http.authorizeRequests().anyRequest().authenticated().and().csrf().disable();
    	HttpsTrusts.beforeConnection();
    	System.out.println("ResourceServerConfiguration");
 
    }
}
