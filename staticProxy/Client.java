package com.proxy.staticProxy;

public class Client {
    public static void main(String[] args) {
        SuperStart superStart=new SuperStart();
        ProxySing sing=new ProxySing(superStart);

        sing.dianwm();
        sing.kaiche();
        sing.qianht();
        sing.sing();
    }
}
