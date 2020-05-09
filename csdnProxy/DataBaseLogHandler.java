package com.proxy.csdnProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataBaseLogHandler implements InvocationHandler {
    private Object object;
    private Date date;

    public DataBaseLogHandler(Object object) {
        super();
        this.object = object;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        before(method);
        //继续将其请求发给内部真实角色
        Object result=method.invoke(object,args);
        after(result);
        if (method.getName().equalsIgnoreCase("logout")){
            System.out.println("*******************************");
        }
        return result;
    }

    public void before(Method method){
        date=new Date();
        DateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(date)+"==执行=="+method.getName());
    }

    public void after(Object o){
        System.out.println("执行结果："+o);
    }
}
