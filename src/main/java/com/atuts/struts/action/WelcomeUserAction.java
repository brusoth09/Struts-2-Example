package com.atuts.struts.action;


import com.opensymphony.xwork2.ActionSupport;

public class WelcomeUserAction extends ActionSupport{
    private String username;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String execute(){
        return "SUCCESS";
    }

    @Override
    public void validate(){
        if("".equals(getUsername())){
            addFieldError("username", getText("username.required"));
        }
    }
}
