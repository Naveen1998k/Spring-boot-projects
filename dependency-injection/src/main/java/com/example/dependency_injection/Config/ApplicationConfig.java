package com.example.dependency_injection.Config;

import com.example.dependency_injection.bean.UserApp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "com.example.dependency_injection")
public class ApplicationConfig {


    // @Bean
    // public SocialMediaApp socialMediaApp() {
    //     return new WhatsAppService();
    // }

     @Bean
     public UserApp userApp() {
         return new UserApp();
     }
}
