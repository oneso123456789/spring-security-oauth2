package io.security.oauht2.springsecurityoauth2;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.SecurityFilterChain;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@EnableWebSecurity
public class SecurityConfig {

    /** 해당 메서드에서 알수있는점은 defaultEntryPoint보다 CustomEntryPoint가 우선적으로 사용된다.*/
    @Bean
    SecurityFilterChain defaultSecurityFilterChain1(HttpSecurity http) throws Exception {
        http.authorizeRequests().anyRequest().permitAll();
        http.httpBasic().authenticationEntryPoint(new CustomAuthenticationEntryPoint());
        return http.build();
    }


}
