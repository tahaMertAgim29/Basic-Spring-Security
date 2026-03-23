package com.example.security.config;




import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
public class SecurityConfig {

   


   SecurityConfig() { }
   @Bean
   public SecurityFilterChain securityFilterChainfilterChain(HttpSecurity security) throws Exception {

        return security.csrf(csrf -> csrf.disable())
                        
                        .authorizeHttpRequests(authorize ->
                           authorize.requestMatchers("/api/members").hasRole("ADMIN")
                                    .requestMatchers("/api/admins").hasRole("ADMIN")
                                    .requestMatchers("/api/admin/add").hasRole("ADMIN")
                                    .requestMatchers("/api/admin/del/*").hasRole("ADMIN")
                                    .requestMatchers("/api/member/add").hasRole("ADMIN")
                                    .requestMatchers("/api/member/del/*").hasRole("ADMIN")
                                    .requestMatchers("/api/member/*").permitAll()
                                    .anyRequest().denyAll()
                                    
                                    
                        )
                        .httpBasic(Customizer.withDefaults())
                        .build();
   }
   
   @Bean
   public UserDetailsService userDetailsService() {
      UserDetails admin = User.builder()
                          .username("admin")
                          .password(passwordEncoder().encode("gl_2024_admin"))
                          .roles("ADMIN") 
                          .build();

      UserDetails member = User.builder()
                           .username("member")
                           .password(passwordEncoder().encode("gl_2024_member"))
                           .roles("MEMBER")
                           .build();

      return new InMemoryUserDetailsManager(admin,member);
   }
   

   @Bean
   public PasswordEncoder passwordEncoder() {
      return new BCryptPasswordEncoder();
   }
    

   
}
