package com.atuts.struts.interceptors;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

/**
 * Created by brusoth on 5/26/16.
 */
public class PrintMsgInterceptors implements Interceptor {
    @Override
    public void destroy() {
        System.out.println("CustomInterceptor destroy() is called...");
    }

    @Override
    public void init() {
        System.out.println("CustomInterceptor init() is called...");
    }

    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        System.out.println("CustomInterceptor, before invocation.invoke()...");

        String result = actionInvocation.invoke();

        System.out.println("CustomInterceptor, after invocation.invoke()...");

        return result;
    }
}
