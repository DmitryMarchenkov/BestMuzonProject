package com.mardmitry.model;

import org.springframework.stereotype.Component;

/**
 * Created by arxan on 17.10.2016.
 */

@Component
public class User {

    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
