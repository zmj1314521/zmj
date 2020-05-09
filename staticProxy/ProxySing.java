package com.proxy.staticProxy;

public class ProxySing implements Start{

    private Start start;

    public ProxySing(Start start){
        super();
        this.start=start;
    }
    public void qianyue() {
        System.out.println("ProxySing.qianyue");
    }

    public void qianht() {
        System.out.println("ProxySing.qianht");
    }

    public void kaiche() {
        System.out.println("ProxySing.kaiche");
    }

    public void dianwm() {
        System.out.println("ProxySing.dianwm");
    }

    public void sing() {
        start.sing();
    }
}
