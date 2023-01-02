package com.projects.MiniBank.config;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

@Configuration
public class SecurityConfig {

//    @Bean
//    PasswordEncoder passwordEncoder(){
//        return new BCryptPasswordEncoder();
//    }

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeHttpRequests()
                .requestMatchers("/myAccount", "/myBalance", "/myLoans", "/myCards").authenticated()
                .requestMatchers("/notices", "/contact", "/user/**").permitAll()
                .and().formLogin()
                .and().httpBasic();
        return http.build();
    }

//    @Bean
//    public UserDetailsService userDetailsService(DataSource dataSource){
//        return new JdbcUserDetailsManager(dataSource);
//    }

//    @Bean
//    public InMemoryUserDetailsManager userDetailsService(){
//        UserDetails admin = User.withUsername("admin")
//                .password("admin")
//                .authorities("read")
//                .build();
//        UserDetails user = User.withUsername("Iyke")
//                .password("password")
//                .authorities("read")
//                .build();
//        return new InMemoryUserDetailsManager(admin, user);
//    }
//
    @Bean
    public PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }

//    @Bean
//    public InMemoryUserDetailsManager userDetailsService(){
//        UserDetails admin = User.builder()
//                .username("admin")
//                .password(passwordEncoder().encode("admin"))
//                .roles("read")
//                .build();
//        UserDetails user = User.builder()
//                .username("Iyke")
//                .password(passwordEncoder().encode("password"))
//                .roles("read")
//                .build();
//        return new InMemoryUserDetailsManager(admin, user);
//    }

}
