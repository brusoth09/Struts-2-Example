package com.atuts.struts.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 */
public class LoginAction extends ActionSupport{
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
        if("mkyong".equals(getUsername())){
            addActionMessage("You are valid user!");
        }else{
            addActionError("I don't know you, dont try to hack me!");
        }
    }
}
