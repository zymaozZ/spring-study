package com.zymao.pojo;

public class User {

    private String name;

    public User() {
        System.out.println("in constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("name = " + name);
    }

}
