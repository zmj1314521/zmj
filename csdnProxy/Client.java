package com.proxy.csdnProxy;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        //创建两个动态代理类对象
        UserDao userDao = new ImpUserDao();
        DataBaseLogHandler userHandler = new DataBaseLogHandler(userDao);
        DocumentDao document = new ImpDocumentDao();
        DataBaseLogHandler documentHandler = new DataBaseLogHandler(document);

        UserDao userProxy =
                (UserDao) Proxy.newProxyInstance(UserDao.class.getClassLoader(),
                        new Class[]{UserDao.class},
                        userHandler);
        DocumentDao documentProxy =
                (DocumentDao) Proxy.newProxyInstance(DocumentDao.class.getClassLoader(),
                        new Class[]{DocumentDao.class},
                        documentHandler);

//        userProxy.login(22222L);
//        documentProxy.add(new Document(3333L,"笑傲江湖"));
//        userProxy.logout();


        userProxy.login(20160708L);
        documentProxy.add(new Document(30160708L,"笑傲江湖"));
        userProxy.logout();
    }
}
