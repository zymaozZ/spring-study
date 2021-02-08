package com.zymao.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {

//    @Value("毛正宇00")
    public String name;

    @Value("hahahff")
    public void setName(String name) {
        this.name = name;
    }
}
