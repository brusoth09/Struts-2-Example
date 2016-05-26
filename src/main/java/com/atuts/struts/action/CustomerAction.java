package com.atuts.struts.action;

import com.atuts.struts.common.Customer;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * Created by brusoth on 5/26/16.
 */
public class CustomerAction extends ActionSupport implements ModelDriven{

    Customer customer = new Customer();

    @Override
    public Object getModel() {
        return customer;
    }
}
