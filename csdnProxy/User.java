package com.proxy.csdnProxy;

public class User {
    // 用户在数据库中的ID
    private Long id;
    // 用户的姓名
    private String name;
    public User(Long id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}