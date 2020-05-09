package com.proxy.dynamicProxy;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        Start start=new SuperStart();
        StartHandle startHandle=new StartHandle(start);

        Start proxy= (Start) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),new Class[]{Start.class},startHandle);

        proxy.sing();
    }
}
