package com.proxy.csdnProxy;

public class Document {
    // 文档在数据库中的ID
    private Long id;
    // 文档的标题
    private String title;
    public Document(Long id, String title) {
        super();
        this.id = id;
        this.title = title;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
}