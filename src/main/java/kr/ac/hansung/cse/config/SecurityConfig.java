package kr.ac.hansung.cse.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
 
	@Override
    protected void configure(HttpSecurity http) throws Exception {
        http        
        	.authorizeRequests()
        		.anyRequest()
        		.permitAll()	//어떤 request 상관 없이 전부 접근 가능하다 
        		.and()	
            .csrf().disable();	//그리고 csrf 기능은 사용하지 않는다.
    }
}