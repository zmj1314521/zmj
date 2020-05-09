package com.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StartHandle implements InvocationHandler {

    Start superStart;

    public StartHandle(Start superStart) {
        super();
        this.superStart = superStart;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("---- --- ---- ---");
        method.invoke(superStart,args);
        return null;
    }
}
