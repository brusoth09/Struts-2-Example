package com.atuts.struts.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by brusoth on 5/26/16.
 */
public class HelloAction extends ActionSupport {
    public String execute() throws Exception {

        System.out.println("HelloAction execute() is called");
        return SUCCESS;

    }
}
