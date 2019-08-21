package com.hoang;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named("man")
@RequestScoped
public class User {
    private String message;
    private String userName;
    private String passWorld;

    public String getPassWorld() {
        return passWorld;
    }

    public void setPassWorld(String passWorld) {
        this.passWorld = passWorld;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String doLogin() {
        if (userName.equals("admin") && passWorld.equals("pass")) {
            message = "Successful";
        } else {
            message = "wrong Username or Passworld";
        }
        System.out.println(userName + passWorld);
        return null;
    }
}
