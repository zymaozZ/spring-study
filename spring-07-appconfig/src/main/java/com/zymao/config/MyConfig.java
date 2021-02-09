package com.zymao.config;

import com.zymao.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(MyConfig2.class)
public class MyConfig {

    @Bean
    public User getUser() {
        return new User();
    }
}
