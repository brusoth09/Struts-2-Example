package com.atuts.struts.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by brusoth on 5/26/16.
 */
public class LongProcessAction extends ActionSupport {
    public String execute() throws Exception {

        //it should be delay few seconds,
        //unless you have a super powerful computer.
        for(int i =0; i<1000000; i++){
            System.out.println(i);
        }
        return SUCCESS;

    }
}
